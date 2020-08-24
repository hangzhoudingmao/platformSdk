package com.dingmao.platformsdk.configurationmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/21
 */
@Getter
@Setter
public class CodeMultiListRsp {
    /**
     * code_type : consectetur
     * sub_data : [{"code_id":"Excepteur","code_type":"occaecat officia in cillum","value":"magna in commodo","name":"mollit sit nisi","content1":null,"content2":null,"content3":null,"content4":"dolor dolore","content5":null},{"code_id":"Duis occaecat fugiat consequat","code_type":"cillum sit","value":"dolor","name":"reprehenderit in eu velit","content1":null,"content2":null,"content3":"voluptate in ea quis","content4":null,"content5":"dolor"}]
     */

    private String code_type;
    private List<SubDataBean> sub_data;

    @Getter
    @Setter
    public static class SubDataBean {
        /**
         * code_id : Excepteur
         * code_type : occaecat officia in cillum
         * value : magna in commodo
         * name : mollit sit nisi
         * content1 : null
         * content2 : null
         * content3 : null
         * content4 : dolor dolore
         * content5 : null
         */

        private String code_id;
        private String code_type;
        private String value;
        private String name;
        private Object content1;
        private Object content2;
        private Object content3;
        private String content4;
        private Object content5;

    }
}
