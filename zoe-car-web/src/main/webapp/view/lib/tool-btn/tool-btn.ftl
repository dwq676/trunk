<div class="tool-btn">
    <style type="text/css">
        .tool-btn-fixed-bottom {
            font-size: 13px;
            text-align: center;
            left: 0;
            bottom: 32px;
            position: fixed;
            width: 100%;
            height: auto;
            z-index: 1009;
            max-height: 210px;
        }

        .tool-btn-message {
            position: fixed;
            float: right;
            margin: 0px 0px;
        }

        #circle {
            width: 20px;
            height: 20px;
            border-radius: 30%;
            position: relative;
            top: -42px;
            color: white;
            background: #f30808;
            box-shadow: 0px 0px 5px #404040;

        .test {
            border: solid red 1px;
        }
    </style>
    <div class="tool-btn-fixed-bottom ">

    <#--        <a class="am-btn am-btn-warning" href="#">
                <i class="am-icon-car"></i>
                发布
            </a>-->

        <button class="am-btn am-btn-warning" data-am-modal="{target: '#my-popup'}"> <i class="am-icon-car"></i>发布</button>

        <button class="am-btn am-btn-default">
            <i class="am-icon-globe am-icon-spin"></i>
            导航
        </button>

        <button class="am-btn am-btn-success">
            通知
            <i class="am-icon-flag"></i>
        </button>
        <script type="application/javascript">
            $(function () {
                $("#circle").css("left", (document.body.clientWidth + 240) / 2 + "px");
                $(window).resize(function () {
                    $("#circle").css("left", (document.body.clientWidth + 240) / 2 + "px");
                });
            });
        </script>
        <div id="notify">
            <div id="circle">
                <p id="messages">99</p>
            </div>
        </div>
    </div>
</div>