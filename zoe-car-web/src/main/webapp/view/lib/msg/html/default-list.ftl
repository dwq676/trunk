<#--item-->
<style type="text/css">
</style>

<#--default-list-->
<style type="text/css">
</style>
<link href="/view/lib/msg/css/default-list.css" rel="stylesheet"/>
<link href="/view/lib/msg/css/item.css" rel="stylesheet"/>

<div class="msg-component am-no-layout" id="msg-component">
    <div class="msg-header">
        <div class="msg-refresh  msg-inline">
            <div id="msg-refresh">
                <a href="#" title="刷新" class="">
                    <i id="msg-refresh-a" class="am-icon-refresh"></i>
                    刷新
                </a>
            </div>
        </div>
        <div class="msg-title msg-inline">
           <span> <a href="#" title="新消息"><span class="am-badge am-badge-danger am-round am-animation-shake"
                                                style="background-color: #f30808"><span
                   id="msg-message-count">6</span>条新消息</span></a></span>
        </div>
        <div class="msg-sort msg-font msg-inline" id="msg-sort">
            <span>
                <a href="/line/query?type=0" title="相关" class="msg-order msg-order-my-line">相关</a>
                <a href="/line/query?type=1" title="附近" class="msg-order msg-order-nearest">附近</a>
                <a href="/line/query?type=2" title="最热" class="msg-order msg-order-hot">团拼</a>
            </span>
        </div>
    </div>
    <div class="msg-layout msg-font" id="msg-layout">
        <div style="am-no-layout">
            <div id="wrapper">
                <div id="scroller">
                    <div id="pullDown">
                        <span id="pullDownSpan" class="pullDownIcon"></span><span class="pullDownLabel">下拉刷新...</span>
                    </div>
                    <ui id="thelist" class="msg-content">
                    </ui>
                    <div id="pullUp">
                        <span id="pullUpSpan" class="pullUpIcon"></span><span class="pullUpLabel">上拉加载更多...</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div id="post-template" class="msg-post-display">
<#include "item.ftl">
</div>
<#--<script type="application/javascript" src="/view/module/message/js/data.js"></script>-->
<script type="application/javascript" src="/view/lib/msg/js/default-list.js"></script>
<script type="application/javascript" src="/view/lib/msg/js/item.js"></script>


