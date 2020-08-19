package com.dingmao.platformsdk.commonentity;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class EntityListRsp {
    /**
     * total_page : -8.188225456323837E7
     * page : 3.122857411489761E7
     * total_count : -3.850048339672787E7
     * page_size : -8.218964516970746E7
     * list : [{"entity_data_id":"sit in consectetur","created_at":"incididunt consequat","created_user_id":"magna consequat consectetur sit","created_user_name":"sit nostrud","updated_user_id":"magna eu","update_user_name":"ipsum id veniam laborum ad","updated_at":"Excepteur culpa","children_list":[{"entity_det_id":"sit magna et ipsum pariatur","field_code":"tempor sit magna Excepteur eiusmod","val":"qui dolore et"}]},{"entity_data_id":"pariatur exercitation in","created_at":"ea eu consequat dolore","created_user_id":"labore dolore cupidatat nisi","created_user_name":"ut Lorem qui nul","updated_user_id":"ad amet nulla culpa cu","update_user_name":"pariatur ad eiusmod","updated_at":"est sit sint exercitation","children_list":[{"entity_det_id":"dolore fugiat quis","field_code":"dolore sed dolor eiusmod","val":"Lorem aliquip dolor"},{"entity_det_id":"Ut","field_code":"nisi consequat Excepteur","val":"voluptate sed Ut Duis"},{"entity_det_id":"aliquip","field_code":"laborum aliquip laboris irure","val":"sit"},{"entity_det_id":"id reprehenderit","field_code":"irure","val":"ut adipisicing officia mollit"},{"entity_det_id":"proident exercitation ut incididunt","field_code":"sed dolor in occaecat","val":""}]},{"entity_data_id":"","created_at":"et laboris tempor","created_user_id":"irure velit cupidatat","created_user_name":"nisi dolor proident mollit dolore","updated_user_id":"eiusmod","update_user_name":"minim fugiat eiusmod","updated_at":"exercitation dolore sint qui aute","children_list":[{"entity_det_id":"non minim consequat","field_code":"consectetur adipisicing veniam repreh","val":"id"},{"entity_det_id":"sun","field_code":"sunt consequat","val":"in"},{"entity_det_id":"sunt offic","field_code":"mollit tempor","val":"ea laboris ut"}]},{"entity_data_id":"ipsum enim dolore occaecat tempor","created_at":"exercitation voluptate et elit","created_user_id":"cupidatat voluptate","created_user_name":"ullamco cillum est eu in","updated_user_id":"amet ut commodo veniam in","update_user_name":"quis sit laboris sed eiusmod","updated_at":"ipsum","children_list":[{"entity_det_id":"qui ad culpa","field_code":"sint eiusmod","val":"proident qui ad est in"},{"entity_det_id":"cupidatat aute","field_code":"non ad laborum","val":"eiusmod "}]},{"entity_data_id":"proident et sunt","created_at":"laborum sunt","created_user_id":"nostrud irure","created_user_name":"dolor","updated_user_id":"aliqua voluptate","update_user_name":"esse exercitation do adipisicing consectetur","updated_at":"occaecat ut in veniam","children_list":[{"entity_det_id":"cupidatat cillum","field_code":"anim","val":"ut"}]}]
     * entitiy_no : enim ipsum ullamco laboris nostrud
     * system_no : laboris esse velit
     */

    private double total_page;
    private double page;
    private double total_count;
    private double page_size;
    private String entitiy_no;
    private String system_no;
    private List<ListBean> list;

    public double getTotal_page() {
        return total_page;
    }

    public void setTotal_page(double total_page) {
        this.total_page = total_page;
    }

    public double getPage() {
        return page;
    }

    public void setPage(double page) {
        this.page = page;
    }

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public double getPage_size() {
        return page_size;
    }

    public void setPage_size(double page_size) {
        this.page_size = page_size;
    }

    public String getEntitiy_no() {
        return entitiy_no;
    }

    public void setEntitiy_no(String entitiy_no) {
        this.entitiy_no = entitiy_no;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * entity_data_id : sit in consectetur
         * created_at : incididunt consequat
         * created_user_id : magna consequat consectetur sit
         * created_user_name : sit nostrud
         * updated_user_id : magna eu
         * update_user_name : ipsum id veniam laborum ad
         * updated_at : Excepteur culpa
         * children_list : [{"entity_det_id":"sit magna et ipsum pariatur","field_code":"tempor sit magna Excepteur eiusmod","val":"qui dolore et"}]
         */

        private String entity_data_id;
        private String created_at;
        private String created_user_id;
        private String created_user_name;
        private String updated_user_id;
        private String update_user_name;
        private String updated_at;
        private List<ChildrenListBean> children_list;

        public String getEntity_data_id() {
            return entity_data_id;
        }

        public void setEntity_data_id(String entity_data_id) {
            this.entity_data_id = entity_data_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getCreated_user_id() {
            return created_user_id;
        }

        public void setCreated_user_id(String created_user_id) {
            this.created_user_id = created_user_id;
        }

        public String getCreated_user_name() {
            return created_user_name;
        }

        public void setCreated_user_name(String created_user_name) {
            this.created_user_name = created_user_name;
        }

        public String getUpdated_user_id() {
            return updated_user_id;
        }

        public void setUpdated_user_id(String updated_user_id) {
            this.updated_user_id = updated_user_id;
        }

        public String getUpdate_user_name() {
            return update_user_name;
        }

        public void setUpdate_user_name(String update_user_name) {
            this.update_user_name = update_user_name;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public List<ChildrenListBean> getChildren_list() {
            return children_list;
        }

        public void setChildren_list(List<ChildrenListBean> children_list) {
            this.children_list = children_list;
        }

        public static class ChildrenListBean {
            /**
             * entity_det_id : sit magna et ipsum pariatur
             * field_code : tempor sit magna Excepteur eiusmod
             * val : qui dolore et
             */

            private String entity_det_id;
            private String field_code;
            private String val;

            public String getEntity_det_id() {
                return entity_det_id;
            }

            public void setEntity_det_id(String entity_det_id) {
                this.entity_det_id = entity_det_id;
            }

            public String getField_code() {
                return field_code;
            }

            public void setField_code(String field_code) {
                this.field_code = field_code;
            }

            public String getVal() {
                return val;
            }

            public void setVal(String val) {
                this.val = val;
            }
        }
    }
}
