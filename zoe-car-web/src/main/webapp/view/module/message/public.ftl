<style type="text/css">
    .am-popup-content {
        margin-top: 20px;
        height: auto;
        width: 100%;
        /*border: solid 1px red;*/
        font-size: 14px;
        font-weight: normal;
    }

    .am-popup-line-weight {
        margin-top: 5px;
    }
</style>

<div class="am-popup" id="my-popup">
    <div class="am-popup-inner">
        <div class="am-popup-hd" style="background-color: #0e90d2">
            <h4 class="am-popup-title" style="color: white">发布消息</h4>
            <span data-am-modal-close class="am-close" style="color:white">&times;</span>
        </div>
        <div class="am-popup-content">
            <div class="am-form am-form-horizontal" id="car-message-public-form">
                <div class="am-form-group">
                    <label for="" class="am-u-sm-2 am-form-label">日期:</label>

                    <div class="am-u-sm-8 am-u-end">
                        <div class="am-input-group am-datepicker-date am-popup-line-weight" data-am-datepicker="{format: 'yyyy-mm-dd'}">
                            <input name="date" type="text" id="car-message-public-date" data-val="true" data-val-required="亲，日期不能为空！" class="am-form-field" placeholder="请选择日期" readonly>
                            <span class="am-input-group-btn am-datepicker-add-on">
                                 <button class="am-btn am-btn-default" type="button">
                                     <span class="am-icon-calendar"></span>
                                 </button>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="am-form-group am-form-inline">
                    <label for="" class="am-u-sm-2 am-form-label">时间:</label>

                    <div class="am-u-sm-8 am-u-end">
                        <div class="am-form-group">
                            <div class="am-form-group">
                                <select style="width: 40px" name="hour" id="car-message-public-hour">
                                    <option value="01">1</option>
                                    <option value="02">2</option>
                                    <option value="03">3</option>
                                    <option value="4">4</option>
                                    <option value="05">5</option>
                                    <option value="06">6</option>
                                    <option value="07">7</option>
                                    <option value="08">8</option>
                                    <option value="09">9</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                    <option value="13">13</option>
                                    <option value="14">14</option>
                                    <option value="15">15</option>
                                    <option value="16">16</option>
                                    <option value="17">17</option>
                                    <option value="18">18</option>
                                    <option value="19">19</option>
                                    <option value="20">20</option>
                                    <option value="21">21</option>
                                    <option value="22">22</option>
                                    <option value="23">23</option>
                                    <option value="24">24</option>
                                </select>
                                <span class="am-form-caret"></span>
                            </div>
                            <span>点</span>
                        </div>
                        <div class="am-form-group">
                            <div class="am-form-group">
                                <select style="width: 40px;" name="minute" id="car-message-public-minute">
                                    <option value="00">0</option>
                                    <option value="01">1</option>
                                    <option value="02">2</option>
                                    <option value="03">3</option>
                                    <option value="04">4</option>
                                    <option value="05">5</option>
                                    <option value="06">6</option>
                                    <option value="07">7</option>
                                    <option value="08">8</option>
                                    <option value="09">9</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                    <option value="13">13</option>
                                    <option value="14">14</option>
                                    <option value="15">15</option>
                                    <option value="16">16</option>
                                    <option value="17">17</option>
                                    <option value="18">18</option>
                                    <option value="19">19</option>
                                    <option value="20">20</option>
                                    <option value="21">21</option>
                                    <option value="22">22</option>
                                    <option value="23">23</option>
                                    <option value="24">24</option>
                                    <option value="25">25</option>
                                    <option value="26">26</option>
                                    <option value="27">27</option>
                                    <option value="28">28</option>
                                    <option value="29">29</option>
                                    <option value="30">30</option>
                                    <option value="31">31</option>
                                    <option value="32">32</option>
                                    <option value="33">33</option>
                                    <option value="34">34</option>
                                    <option value="35">35</option>
                                    <option value="36">36</option>
                                    <option value="37">37</option>
                                    <option value="38">38</option>
                                    <option value="39">39</option>
                                    <option value="40">40</option>
                                    <option value="41">41</option>
                                    <option value="42">42</option>
                                    <option value="43">43</option>
                                    <option value="44">44</option>
                                    <option value="45">45</option>
                                    <option value="46">46</option>
                                    <option value="47">47</option>
                                    <option value="48">48</option>
                                    <option value="49">49</option>
                                    <option value="50">50</option>
                                    <option value="51">51</option>
                                    <option value="52">52</option>
                                    <option value="53">53</option>
                                    <option value="54">54</option>
                                    <option value="55">55</option>
                                    <option value="56">56</option>
                                    <option value="57">57</option>
                                    <option value="58">58</option>
                                    <option value="59">59</option>
                                </select>
                                <span class="am-form-caret"></span>
                            </div>
                            <span>分</span>
                        </div>
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="" class="am-u-sm-2 am-form-label">起始:</label>

                    <div class="am-u-sm-8 am-u-end">
                        <div class="am-input-group am-popup-line-weight">
                            <input name="start" id="car-picker-start" type="text" data-val="true" data-val-required="亲，您还没有选择出发地！" value="" class="am-form-field" placeholder="请选择出发地" readonly>
                            <span class="am-input-group-btn">
                                 <button class="am-btn am-btn-default" data-am-modal="{target: '#car-map-popup'}" onclick="javascript:carzoe.map.picker('car-map-popup-content');positionId='car-picker-start';way='start'" type="button">
                                     <span class="am-icon-map-marker"></span>
                                 </button>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="" class="am-u-sm-2 am-form-label">终止:</label>

                    <div class="am-u-sm-8 am-u-end">
                        <div class="am-input-group">
                            <input name="end" id="car-picker-end" type="text" data-val="true" data-val-required="亲，您还没有选择目的地！" value="" class="am-form-field" placeholder="请选择目的地" readonly>
                            <span class="am-input-group-btn">
                                 <button class="am-btn am-btn-default" data-am-modal="{target: '#car-map-popup'}" onclick="javascript:carzoe.map.picker('car-map-popup-content');positionId='car-picker-end';way=''" type="button">
                                     <span class="am-icon-map-marker"></span>
                                 </button>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="am-form-group">
                    <label for="" class="am-u-sm-2 am-form-label">途经:</label>

                    <div class="am-u-sm-8 am-u-end">
                        <div class="am-input-group">
                            <input name="goby" id="car-picker-goby" type="text" value="" class="am-form-field" placeholder="途经，多个逗句隔开" readonly>
                            <span class="am-input-group-btn">
                                 <button class="am-btn am-btn-default" data-am-modal="{target: '#car-map-popup'}" onclick="javascript:carzoe.map.picker('car-map-popup-content');positionId='car-picker-goby';way='goby'" type="button">
                                     <span class="am-icon-map-marker"></span>
                                 </button>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="am-form-group am-form-inline">
                    <label for="" class="am-u-sm-2 am-form-label">剩余:</label>

                    <div class="am-u-sm-2 am-u-end ">
                        <input name="leftCount" data-val="true" data-val-required="亲，请输入剩余的座位数！" data-val-pattern="^[0-9]*$" maxlength="2" value="" data-val-regex="亲，只能输入数字" type="text" placeholder="位置数"/>
                    </div>
                    位
                </div>
                <div class="am-form-group">
                    <label for="" class="am-u-sm-2 am-form-label">手机:</label>

                    <div class="am-u-sm-3 am-u-end">
                        <input name="phone" data-val="true" data-val-required="亲，输入您的手机号码！" maxlength="11" data-val-pattern="" data-val-regex="亲，您确定输入的手机号码正确？" type="text" id="" placeholder="手机号码">
                    </div>
                </div>
                <div class="am-form-group am-form-inline" style="text-align: center">
                    <button class="am-btn am-btn-success" id="car-message-public-ok">
                        <i class="am-icon-check"></i>
                        确定
                    </button>

                    <button class="am-btn am-btn-warning" id="car-message-public-cancel">
                        <i class="am-icon-close"></i>
                        取消
                    </button>
                </div>
                <div class="am-form-group">
                    <input type="text" style="display: none;" id="startLongitude" name="startLongitude">
                    <input type="text" style="display: none" id="startLatitude" name="startLatitude">
                    <input type="text" style="display: none" id="endLatitude" name="endLatitude">
                    <input type="text" style="display: none;" id="endLongitude" name="endLongitude">
                </div>
            </div>
        </div>
    </div>
</div>

<div class="am-popup" id="car-map-popup">
    <div class="am-popup-inner">
        <div class="am-popup-hd">
            <h4 class="am-popup-title">地图</h4>
      <span data-am-modal-close
            class="am-close">&times;</span>
        </div>
        <div class="am-popup-bd" style="height: 80%;margin-top: 10px" id="car-map-popup-content">
        </div>

        <div class="am-form-group am-form-inline" style="text-align: center;margin-top: 10px;">
            <button class="am-btn am-btn-success" id="car-map-ok">
                <i class="am-icon-check"></i> 确定
            </button>

            <button class="am-btn am-btn-warning" id="car-map-cancel">
                <i class="am-icon-close"></i> 取消
            </button>
        </div>
    </div>
</div>

<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=miBoGAl4fp53p2b2Dfb9FQLg"></script>
<script type="text/javascript" src="/theme/lib/js/carzoe.js"></script>
<script type="text/javascript" src="/view/module/message/js/public.js"></script>