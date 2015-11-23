var positionId, way;
$(function () {
    var oDate = new Date();
    $("#car-message-public-hour").find("option[value='" + (oDate.getHours() < 10 ? "0" + oDate.getHours() : oDate.getHours()) + "']").attr("selected", true);
    $("#car-message-public-minute").find("option[value='" + (oDate.getMinutes() < 10 ? "0" + oDate.getMinutes() : oDate.getMinutes()) + "']").attr("selected", true);
    $("#car-message-public-date").val(getdate());
    $("#car-map-ok").click(function () {
        //alert(positionId)
        var $this = $("#" + positionId);
        if (way == "goby") {
            var originValue = $this.val();
            var vals = [];
            if (originValue != "") {
                vals.push(originValue)
            }
            vals.push(carzoe.map.picker.position.address);
            $this.val(vals.join(";;"));
            //alert($this.val())
        } else if (way == "start") {
            $("#startLongitude").val(carzoe.map.picker.position.longitude);
            $("#startLatitude").val(carzoe.map.picker.position.latitude);
            $this.val(carzoe.map.picker.position.address);
        } else {
            $("#endLongitude").val(carzoe.map.picker.position.longitude);
            $("#endLatitude").val(carzoe.map.picker.position.latitude);
            $this.val(carzoe.map.picker.position.address);
        }
        //alert(carzoe.map.picker.position.address)
        $('#car-map-popup').modal('close');
    });
    $("#car-map-cancel").click(function () {
        $('#car-map-popup').modal('close');
    });

    $("#car-message-public-ok").click(function () {
        form.submit("car-message-public-form", ["text", "select"]).ajax("/car/message/data/public/submit",
            function (result) {
                if (result.code == "0") {
                    dialog.alert(form.success);
                    $('#my-popup').modal('close');
                    message.append(result.data);
                } else {
                    dialog.alert(result.message);
                }
            }, carzoe.map.picker.position.detail);
    });
    $("#car-message-public-cancel").click(function () {
        $("#my-popup").modal("close");
    });
    /*        $("#car-message-public-hour").change(function () {
     alert($(this).find("option:selected").text());
     })*/
});
