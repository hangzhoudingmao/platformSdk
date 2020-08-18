package com.dingmao.platformsdk.coderulemanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/17
 */
public class CodeRecordRsp {
    /**
     * total_count : reprehenderit proident pariatur ex consequat
     * total_page : cillum
     * list : [{"rule_code_record_id":"do irure qui nostrud adipisicing","code_start":"ut reprehenderit elit dolor Excepteur","code_end":"nulla est","number":"deserunt Ut","system_no":"in anim","create_date":"ullamco ex esse Excepteur quis","pipeline_sort_id":"mollit consectetur ","pipeline_name":"ad magna sunt","make_user":"laborum","pipeline_section_id":"sit do dolor","company_id":"ex aute s"},{"rule_code_record_id":"culpa","code_start":"dolore mollit culpa","code_end":"consectetur dolore id laboris nulla","number":"esse cillum","system_no":"consectetur ut","create_date":"sed","pipeline_sort_id":"anim ea in","pipeline_name":"magna adipisicing officia enim","make_user":"ex","pipeline_section_id":"Excepteur","company_id":"qui velit sint sit dolore"},{"rule_code_record_id":"sit","code_start":"aliqua","code_end":"cillum consequa","number":"ut in cupidatat ullamco dolore","system_no":"elit","create_date":"deserunt elit velit eiusmod","pipeline_sort_id":"veniam esse elit tempor","pipeline_name":"deserunt nisi","make_user":"commodo exercitation","pipeline_section_id":"sed incididunt","company_id":"anim proident nisi quis"},{"rule_code_record_id":"eu et do","code_start":"dolore est consequa","code_end":"veniam occaecat","number":"magna labore proident dolor consequat","system_no":"ut occaecat id proident","create_date":"laborum","pipeline_sort_id":"dolor eiusmod dolore enim est","pipeline_name":"dolore in Ut esse occaecat","make_user":"dolor commodo eiusmod fugiat ad","pipeline_section_id":"sed veniam","company_id":"elit quis id eu Ut"},{"rule_code_record_id":"quis tempor dolore","code_start":"proident Excepteur irure ut consequat","code_end":"ut quis","number":"in magna exerci","system_no":"qui irure cillum dolore ullamco","create_date":"laboris sunt","pipeline_sort_id":"minim adipisicing pariatur","pipeline_name":"ut fugiat id dolor voluptate","make_user":"amet","pipeline_section_id":"proident labore ut","company_id":"ea cupidatat in labore"}]
     */

    private String total_count;
    private String total_page;
    private List<ListBean> list;

    public String getTotal_count() {
        return total_count;
    }

    public void setTotal_count(String total_count) {
        this.total_count = total_count;
    }

    public String getTotal_page() {
        return total_page;
    }

    public void setTotal_page(String total_page) {
        this.total_page = total_page;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * rule_code_record_id : do irure qui nostrud adipisicing
         * code_start : ut reprehenderit elit dolor Excepteur
         * code_end : nulla est
         * number : deserunt Ut
         * system_no : in anim
         * create_date : ullamco ex esse Excepteur quis
         * pipeline_sort_id : mollit consectetur
         * pipeline_name : ad magna sunt
         * make_user : laborum
         * pipeline_section_id : sit do dolor
         * company_id : ex aute s
         */

        private String rule_code_record_id;
        private String code_start;
        private String code_end;
        private String number;
        private String system_no;
        private String create_date;
        private String pipeline_sort_id;
        private String pipeline_name;
        private String make_user;
        private String pipeline_section_id;
        private String company_id;

        public String getRule_code_record_id() {
            return rule_code_record_id;
        }

        public void setRule_code_record_id(String rule_code_record_id) {
            this.rule_code_record_id = rule_code_record_id;
        }

        public String getCode_start() {
            return code_start;
        }

        public void setCode_start(String code_start) {
            this.code_start = code_start;
        }

        public String getCode_end() {
            return code_end;
        }

        public void setCode_end(String code_end) {
            this.code_end = code_end;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getSystem_no() {
            return system_no;
        }

        public void setSystem_no(String system_no) {
            this.system_no = system_no;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }

        public String getPipeline_sort_id() {
            return pipeline_sort_id;
        }

        public void setPipeline_sort_id(String pipeline_sort_id) {
            this.pipeline_sort_id = pipeline_sort_id;
        }

        public String getPipeline_name() {
            return pipeline_name;
        }

        public void setPipeline_name(String pipeline_name) {
            this.pipeline_name = pipeline_name;
        }

        public String getMake_user() {
            return make_user;
        }

        public void setMake_user(String make_user) {
            this.make_user = make_user;
        }

        public String getPipeline_section_id() {
            return pipeline_section_id;
        }

        public void setPipeline_section_id(String pipeline_section_id) {
            this.pipeline_section_id = pipeline_section_id;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }
    }
}
