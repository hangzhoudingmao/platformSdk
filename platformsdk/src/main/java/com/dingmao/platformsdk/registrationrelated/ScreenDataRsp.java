package com.dingmao.platformsdk.registrationrelated;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class ScreenDataRsp {
    /**
     * total_page : -4.240160417066026E7
     * page : -6.761550865394711E7
     * total_count : -6.727621448523325E7
     * page_size : -2509596.0358709693
     * data : [{"title":"Ut consequat sed dolore","indexNo":"proident","indexs":{"x":{"unit":"est mollit cillum proident","name":"do ad nostrud","data":["p","adipisicing"]},"y":{"legend":["anim laboris"],"items":[{"unit":"ut Lorem dolor ex dolor","name":"nostrud mollit magna nulla","data":["pariatur","ullamco et","fugiat "]},{"unit":"culpa ad id nulla","name":"Lorem","data":["aliquip dolore","sit quis ullamco","eiusmod ex aliqua laboris"]},{"unit":"velit reprehenderit non laboris Ut","name":"aute proident quis nulla reprehenderit","data":["cillum Ut","in exercitation aliquip pariatur"]},{"unit":"amet ex elit","name":"Duis proident et","data":["dolore fugiat velit labore","co","eiusmod Lorem non","eu sunt dolor do"]}]}}},{"title":"aliquip elit magna aute Excepteur","indexNo":"eu aliquip veniam cupid","indexs":{"x":{"unit":"nisi dolore in occaecat labore","name":"velit commodo non fugiat","data":["dolor nisi","dolore velit enim minim deserunt","adipisicing enim dolor laboris","amet in consectetur fugiat commodo","dolore nisi non"]},"y":{"legend":["aute non dolore cupidatat","qui aute"],"items":[{"unit":"cillum veniam ex amet","name":"id exercitatio","data":["aliqua in deserunt mollit adipisicing"]}]}}}]
     */

    private double total_page;
    private double page;
    private double total_count;
    private double page_size;
    private List<DataBean> data;


    @Getter
    @Setter
    public static class DataBean {
        /**
         * title : Ut consequat sed dolore
         * indexNo : proident
         * indexs : {"x":{"unit":"est mollit cillum proident","name":"do ad nostrud","data":["p","adipisicing"]},"y":{"legend":["anim laboris"],"items":[{"unit":"ut Lorem dolor ex dolor","name":"nostrud mollit magna nulla","data":["pariatur","ullamco et","fugiat "]},{"unit":"culpa ad id nulla","name":"Lorem","data":["aliquip dolore","sit quis ullamco","eiusmod ex aliqua laboris"]},{"unit":"velit reprehenderit non laboris Ut","name":"aute proident quis nulla reprehenderit","data":["cillum Ut","in exercitation aliquip pariatur"]},{"unit":"amet ex elit","name":"Duis proident et","data":["dolore fugiat velit labore","co","eiusmod Lorem non","eu sunt dolor do"]}]}}
         */

        private String title;
        private String indexNo;
        private IndexsBean indexs;

        @Getter
        @Setter
        public static class IndexsBean {
            /**
             * x : {"unit":"est mollit cillum proident","name":"do ad nostrud","data":["p","adipisicing"]}
             * y : {"legend":["anim laboris"],"items":[{"unit":"ut Lorem dolor ex dolor","name":"nostrud mollit magna nulla","data":["pariatur","ullamco et","fugiat "]},{"unit":"culpa ad id nulla","name":"Lorem","data":["aliquip dolore","sit quis ullamco","eiusmod ex aliqua laboris"]},{"unit":"velit reprehenderit non laboris Ut","name":"aute proident quis nulla reprehenderit","data":["cillum Ut","in exercitation aliquip pariatur"]},{"unit":"amet ex elit","name":"Duis proident et","data":["dolore fugiat velit labore","co","eiusmod Lorem non","eu sunt dolor do"]}]}
             */

            private XBean x;
            private YBean y;

            @Getter
            @Setter
            public static class XBean {
                /**
                 * unit : est mollit cillum proident
                 * name : do ad nostrud
                 * data : ["p","adipisicing"]
                 */

                private String unit;
                private String name;
                private List<String> data;
            }

            @Getter
            @Setter
            public static class YBean {
                private List<String> legend;
                private List<ItemsBean> items;


                @Getter
                @Setter
                public static class ItemsBean {
                    /**
                     * unit : ut Lorem dolor ex dolor
                     * name : nostrud mollit magna nulla
                     * data : ["pariatur","ullamco et","fugiat "]
                     */

                    private String unit;
                    private String name;
                    private List<String> data;


                }
            }
        }
    }
}
