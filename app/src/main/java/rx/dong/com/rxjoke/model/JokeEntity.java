package rx.dong.com.rxjoke.model;

import java.util.List;

/**
 * Created by SkyEyesStion on 2016/4/7.
 */
public class JokeEntity {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"allNum":2980,"allPages":149,"contentlist":[{"ct":"2015-08-13 13:10:26
     * .149","text":"新人发帖求过\u2026\u2026
     * 媳妇最近怀孕了\u2026天天这也不想吃那也不想吃\u2026有一天发脾气要我给他做想吃的，结果做了好多还是没有想吃的\u2026
     * 最后着急了大喊:再做不出我想吃的我就去大街上要饭\u2026\u2026我想说:你吃什么自己都不知道我怎么做啊\u2026唉\u2026想想男人女人都不容易啊\u2026",
     * "title":"媳妇儿有了\u2026","type":1},{"ct":"2015-08-13 13:10:26.149",
     * "text":"为了让自己多活动，我把放在电脑桌上的零食拿到了外面的茶几上，这样最起码为了吃我也能走动走动。\u2026\u2026\u2026\u2026
     * 现在我的零食经常会过期\u2026\u2026","title":"计划失败，吃货兼网虫的悲哀","type":1},{"ct":"2015-08-13 13:10:26
     * .148",
     * "text":"在家叫我滚出去，在外面喊我滚回家，不补课说我学习差，补课说我浪费钱，吃东西说我嘴巴馋，不吃说我要成仙，在家不学习说我不努力，在家一学习说我只会玩手机，不讲话说我闷得很，讲话说我屁话多，到底想让人怎么样。同意的??一个。","title":"内心是崩溃的","type":1},{"ct":"2015-08-13 12:10:18.052","text":"吃货的最高境界是什么?<\/p><p>甲:看到什么能吃的都想吃<\/p><p>乙:看到屎都觉得饿<\/p><p>.......","title":"吃货的最高境界是什么","type":1},{"ct":"2015-08-13 12:10:18.052","text":"小区锻炼的大爷对我说：\u201c太极拳很厉害，可以以柔克钢。\u201d<\/p><p>然后我拿了根钢管过去，对大爷说：\u201c大爷您再说一遍！\u201d<\/p><p>大爷什么也没说，跳起了钢管舞\u2026\u2026","title":"大爷您再说一遍","type":1},{"ct":"2015-08-13 12:10:18.052","text":"小时候犯错了，总被妈妈打。<\/p><p>出于男子汉的气概，我忍住不让眼泪流出来！<\/p><p>妈妈就说：\u201c哟，还不哭，看来是我打轻了，你肯定不会长记性。\u201d<\/p><p>完了往死里打。<\/p><p>实在忍不住哭了，妈妈又说：\u201c还哭，看我不打死你。\u201d","title":"还哭，看我不打死你","type":1},{"ct":"2015-08-13 12:10:18.052","text":"小王：\u201c我厌倦了这个世界，只是想趴在桌子上一个人静静。\u201d<\/p><p>老湿：\u201c上课睡觉你还有理了，滚粗去\u2026\u2026\u201d","title":"想趴在桌子上一个人静静","type":1},{"ct":"2015-08-13 12:10:18.050","text":"老师：\u201c今天我们谈谈理想吧！\u201d<\/p><p>小红：\u201c我的理想是当个科学家。\u201d<\/p><p>小王：\u201c我的理想是当作家。\u201d<\/p><p>小明：\u201c我想当个印刷工。\u201d<\/p><p>老师：\u201c小明啊，那个理想立志要高远。\u201d<\/p><p>小明：\u201c再搞一台印钞机。\u201d","title":"不得了的志向","type":1},{"ct":"2015-08-13 12:10:18.004","text":"老王去牙科诊所拔牙，牙医收费300元。<\/p><p>老王不满地说：\u201c太过分了，你拔牙只用了2分钟，就要300元。\u201d<\/p><p>牙医说：\u201c如果你嫌太快了，我也可以慢慢帮你拔，拔到你满意为止。\u201d","title":"拔到你满意为止","type":1}],"currentPage":1,"maxResult":20}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * allNum : 2980
     * allPages : 149
     * contentlist : [{"ct":"2015-08-13 13:10:26.149","text":"新人发帖求过\u2026\u2026
     * 媳妇最近怀孕了\u2026天天这也不想吃那也不想吃\u2026有一天发脾气要我给他做想吃的，结果做了好多还是没有想吃的\u2026
     * 最后着急了大喊:再做不出我想吃的我就去大街上要饭\u2026\u2026我想说:你吃什么自己都不知道我怎么做啊\u2026唉\u2026想想男人女人都不容易啊\u2026",
     * "title":"媳妇儿有了\u2026","type":1},{"ct":"2015-08-13 13:10:26.149",
     * "text":"为了让自己多活动，我把放在电脑桌上的零食拿到了外面的茶几上，这样最起码为了吃我也能走动走动。\u2026\u2026\u2026\u2026
     * 现在我的零食经常会过期\u2026\u2026","title":"计划失败，吃货兼网虫的悲哀","type":1},{"ct":"2015-08-13 13:10:26
     * .148",
     * "text":"在家叫我滚出去，在外面喊我滚回家，不补课说我学习差，补课说我浪费钱，吃东西说我嘴巴馋，不吃说我要成仙，在家不学习说我不努力，在家一学习说我只会玩手机，不讲话说我闷得很，讲话说我屁话多，到底想让人怎么样。同意的??一个。","title":"内心是崩溃的","type":1},{"ct":"2015-08-13 12:10:18.052","text":"吃货的最高境界是什么?<\/p><p>甲:看到什么能吃的都想吃<\/p><p>乙:看到屎都觉得饿<\/p><p>.......","title":"吃货的最高境界是什么","type":1},{"ct":"2015-08-13 12:10:18.052","text":"小区锻炼的大爷对我说：\u201c太极拳很厉害，可以以柔克钢。\u201d<\/p><p>然后我拿了根钢管过去，对大爷说：\u201c大爷您再说一遍！\u201d<\/p><p>大爷什么也没说，跳起了钢管舞\u2026\u2026","title":"大爷您再说一遍","type":1},{"ct":"2015-08-13 12:10:18.052","text":"小时候犯错了，总被妈妈打。<\/p><p>出于男子汉的气概，我忍住不让眼泪流出来！<\/p><p>妈妈就说：\u201c哟，还不哭，看来是我打轻了，你肯定不会长记性。\u201d<\/p><p>完了往死里打。<\/p><p>实在忍不住哭了，妈妈又说：\u201c还哭，看我不打死你。\u201d","title":"还哭，看我不打死你","type":1},{"ct":"2015-08-13 12:10:18.052","text":"小王：\u201c我厌倦了这个世界，只是想趴在桌子上一个人静静。\u201d<\/p><p>老湿：\u201c上课睡觉你还有理了，滚粗去\u2026\u2026\u201d","title":"想趴在桌子上一个人静静","type":1},{"ct":"2015-08-13 12:10:18.050","text":"老师：\u201c今天我们谈谈理想吧！\u201d<\/p><p>小红：\u201c我的理想是当个科学家。\u201d<\/p><p>小王：\u201c我的理想是当作家。\u201d<\/p><p>小明：\u201c我想当个印刷工。\u201d<\/p><p>老师：\u201c小明啊，那个理想立志要高远。\u201d<\/p><p>小明：\u201c再搞一台印钞机。\u201d","title":"不得了的志向","type":1},{"ct":"2015-08-13 12:10:18.004","text":"老王去牙科诊所拔牙，牙医收费300元。<\/p><p>老王不满地说：\u201c太过分了，你拔牙只用了2分钟，就要300元。\u201d<\/p><p>牙医说：\u201c如果你嫌太快了，我也可以慢慢帮你拔，拔到你满意为止。\u201d","title":"拔到你满意为止","type":1}]
     * currentPage : 1
     * maxResult : 20
     */

    private ShowapiResBodyEntity showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyEntity getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyEntity showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyEntity {
        private int allNum;
        private int allPages;
        private int currentPage;
        private int maxResult;
        /**
         * ct : 2015-08-13 13:10:26.149
         * text : 新人发帖求过……
         * 媳妇最近怀孕了…天天这也不想吃那也不想吃…有一天发脾气要我给他做想吃的，结果做了好多还是没有想吃的…最后着急了大喊:再做不出我想吃的我就去大街上要饭……我想说:你吃什么自己都不知道我怎么做啊…唉…想想男人女人都不容易啊…
         * title : 媳妇儿有了…
         * type : 1
         */

        private List<ContentlistEntity> contentlist;

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }

        public List<ContentlistEntity> getContentlist() {
            return contentlist;
        }

        public void setContentlist(List<ContentlistEntity> contentlist) {
            this.contentlist = contentlist;
        }

        public static class ContentlistEntity {
            private String ct;
            private String text;
            private String title;
            private int type;

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
