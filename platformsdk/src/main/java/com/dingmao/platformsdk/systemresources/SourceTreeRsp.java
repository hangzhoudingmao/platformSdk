package com.dingmao.platformsdk.systemresources;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class SourceTreeRsp {
    /**
     * system_no : velit amet
     * system_name : irure non consectetur fugiat qui
     * children : [{"source_sort_id":"dolor","parent_id":"ea Lorem veniam reprehenderit aliquip","source_sort_name":"sunt veniam mollit proident","source_sort_no":"occaecat officia anim quis nulla","system_no":"voluptate cupidatat Duis nostrud mollit","children":[{},{},{},{},{}]},{"source_sort_id":"occaecat cul","parent_id":"pariatur reprehenderit Ut dolor enim","source_sort_name":"sed do sint labore cupidatat","source_sort_no":"dolore","system_no":"sit Excepteur exercitation","children":[{}]},{"source_sort_id":"nisi anim Excepteur","parent_id":"et sit ut nulla","source_sort_name":"dolor nulla culpa magna labore","source_sort_no":"laboris enim in ipsum","system_no":"ipsum","children":[{}]},{"source_sort_id":"qui cillum commodo","parent_id":"enim consectetur","source_sort_name":"laboris mollit exercitation adipisicing","source_sort_no":"reprehenderit enim dolore","system_no":"qui magna consequat ea","children":[{},{},{},{},{}]}]
     */

    private String system_no;
    private String system_name;
    private List<ChildrenBean> children;

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name;
    }

    public List<ChildrenBean> getChildren() {
        return children;
    }

    public void setChildren(List<ChildrenBean> children) {
        this.children = children;
    }

    public class ChildrenBean{

        /**
         * source_sort_id : labore
         * parent_id : cillum culpa
         * source_sort_name : fugiat reprehenderit officia ex
         * source_sort_no : voluptate
         * system_no : ut do
         * children : [{},{}]
         */

        private String source_sort_id;
        private String parent_id;
        private String source_sort_name;
        private String source_sort_no;
        private String system_no;
        private List<SubChildrenBean> children;

        public String getSource_sort_id() {
            return source_sort_id;
        }

        public void setSource_sort_id(String source_sort_id) {
            this.source_sort_id = source_sort_id;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public String getSource_sort_name() {
            return source_sort_name;
        }

        public void setSource_sort_name(String source_sort_name) {
            this.source_sort_name = source_sort_name;
        }

        public String getSource_sort_no() {
            return source_sort_no;
        }

        public void setSource_sort_no(String source_sort_no) {
            this.source_sort_no = source_sort_no;
        }

        public String getSystem_no() {
            return system_no;
        }

        public void setSystem_no(String system_no) {
            this.system_no = system_no;
        }

        public List<SubChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<SubChildrenBean> children) {
            this.children = children;
        }

        public class SubChildrenBean {
            private String source_sort_id;
            private String parent_id;
            private String source_sort_name;
            private String source_sort_no;
            private String system_no;

            public String getSource_sort_id() {
                return source_sort_id;
            }

            public void setSource_sort_id(String source_sort_id) {
                this.source_sort_id = source_sort_id;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getSource_sort_name() {
                return source_sort_name;
            }

            public void setSource_sort_name(String source_sort_name) {
                this.source_sort_name = source_sort_name;
            }

            public String getSource_sort_no() {
                return source_sort_no;
            }

            public void setSource_sort_no(String source_sort_no) {
                this.source_sort_no = source_sort_no;
            }

            public String getSystem_no() {
                return system_no;
            }

            public void setSystem_no(String system_no) {
                this.system_no = system_no;
            }
        }
    }
}
