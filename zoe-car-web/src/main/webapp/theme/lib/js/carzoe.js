function carzoe() {
};

carzoe.native = function () {
    try {
        carzoe.native.version = window.native.version();
        carzoe.native.handler = carzoe.native.android;
    }
    catch (e) {
    }
};

carzoe.native.handler = function () {
};

carzoe.native.handler.phone = function () {
};

carzoe.native.handler.gps = function (callback) {
    callback({
        longitude: 118.12277,
        latitude: 24.474381
    });
};

carzoe.native.version = null;

carzoe.native.android = function () {
};

carzoe.native.android.phone = function (number) {
    window.native.phone(number);
};

carzoe.native.android.gps = function (callback) {
    callback(JSON.parse(window.native.gps()));
};

carzoe.native();

carzoe.map = function (id, city) {
    var map = new BMap.Map(id);
    map.addControl(new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT}));
    map.addControl(new BMap.NavigationControl());
    map.addControl(new BMap.NavigationControl({anchor: BMAP_ANCHOR_TOP_RIGHT, type: BMAP_NAVIGATION_CONTROL_SMALL}));
    if (city)
        map.centerAndZoom(city, 13);
    else {
        carzoe.native.handler.gps(function (json) {
            var point = new BMap.Point(json.longitude, json.latitude);
            map.centerAndZoom(point, 16);
            carzoe.map.marker(map, point);
        });
    }

    return map;
};

carzoe.map.marker = function (map, point) {
    if (carzoe.map.marker.now)
        map.removeOverlay(carzoe.map.marker.now);
    carzoe.map.marker.now = new BMap.Marker(point);
    map.addOverlay(carzoe.map.marker.now);
};

carzoe.map.marker.now = null;

carzoe.map.picker = function (id, city) {
    var map = carzoe.map(id, city);
    if (!carzoe.map.geocoder)
        carzoe.map.geocoder = new BMap.Geocoder();
    map.addEventListener("click", function (e) {
        carzoe.map.picker.position.longitude = e.point.lng;
        carzoe.map.picker.position.latitude = e.point.lat;
        carzoe.map.marker(map, e.point);
        carzoe.map.geocoder.getLocation(new BMap.Point(e.point.lng, e.point.lat), function (result) {
            if (result) {
                carzoe.map.picker.position.address = result.address;
                carzoe.map.picker.position.detail = result.addressComponents;
            }
        });
    });
};

carzoe.map.picker.position = {
    longitude: 0.0,
    latitude: 0.0,
    address: "",
    detail: {}
};

carzoe.map.geocoder = null;

carzoe.map.point = function (city, address, callback) {
    if (!carzoe.map.geocoder)
        carzoe.map.geocoder = new BMap.Geocoder();
    carzoe.map.geocoder.getPoint(address, function (point) {
        if (point) {
            callback({
                longitude: point.lng,
                latitude: point.lat
            });
        }
    }, city);
};

carzoe.map.driver = function (id, longitude, latitude) {
    var map = carzoe.map(id);
    carzoe.map.driver.target = new BMap.Point(longitude, latitude);
    carzoe.map.driver.ing = new BMap.DrivingRoute(map, {renderOptions: {map: map, autoViewport: true}});
    carzoe.map.driver.move();
};

carzoe.map.driver.target = null;
carzoe.map.driver.ing = null;

carzoe.map.driver.move = function () {
    carzoe.map.driver.ing.search(new BMap.Point(carzoe.map.picker.position.longitude, carzoe.map.picker.position.latitude), carzoe.map.driver.target);

    setTimeout(carzoe.map.driver.move, 1000);
};
