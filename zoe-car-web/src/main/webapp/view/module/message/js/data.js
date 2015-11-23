var lineMessage = {
    type: 0,//0=相关 1=附近 2=最近
    count: 3,
    posts: [{
        name: '李时时',
        createTime: '02月30号 17:30:30',
        photo: 'http://static.duoshuo.com/images/noavatar_default.png',
        userId: '1',
        content: {
            dateCn: '今天1',
            date: '2015-09-28',
            time: '18:00:00',
            timeCn: '下午18点',
            start: '长泰',
            goby: ['杏林', '机场', '万达', '前浦'],
            end: '软件园',
            left: 3,
            phone: '1875643227'
        }
    }, {
        name: '张又军',
        createTime: '07月30号 16:04:30',
        photo: 'http://s.amazeui.org/media/i/demos/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80',
        userId: '2',
        content: {
            dateCn: '今天2',
            date: '2015-09-28',
            time: '19:00:00',
            timeCn: '下午19点',
            start: '长泰',
            goby: ['恢复', '压力'],
            end: '前浦,测试长度前浦,测试长度111111111111111111111嘻嘻嘻寺嘻叮咛叶111111111111111嘻嘻111111111嘻嘻嘻嘻嘻嘻叶吉嘻吉吉吉叶嘻嘻叶',
            left: 3,
            phone: '1167894531'
        }
    }, {
        name: '刘绩成',
        createTime: '06月30号 16:04:30',
        photo: 'http://blog.jobbole.com/wp-content/themes/jobboleblogv3/_assets/img/jobbole-logo.png',
        userId: '3',
        content: {
            dateCn: '今天3',
            date: '2015-09-28',
            time: '19:00:00',
            timeCn: '下午19点',
            start: '长泰',
            goby: ['叮嘱', '需要', '嚼蜡'],
            end: '里昂',
            left: 3,
            phone: '1767894531'
        }
    }, {
        name: '陈成辉',
        createTime: '09月27号 16:04:30',
        photo: 'https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=4046719105,2434242014&fm=58',
        userId: '4',
        content: {
            dateCn: '今天4',
            date: '2015-09-28',
            time: '19:00:00',
            timeCn: '下午19点',
            start: '长泰',
            goby: ['勒中', '市盈率', '宜宾'],
            end: '对照表',
            left: 3,
            phone: '1567894531'
        }
    }]
};
/**
 * 获取消息
 * @param type 消息类型（相关的？附近？）
 * @param timestamp 时间戳
 * @param 地理位置
 */
function getMessage(type, timestamp, location) {
    var request = {
        type: type,
        timestamp: timestamp,
        location: location
    };
    ajax("/message/data/query", request, function () {

    });
}



