package com.dingmao.platformsdk.coderulemanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/17
 */
public class CodeRuleResolveRsp {

    /**
     * system_name : repreh
     * system_no : minim magna quis
     * company_id : voluptate esse magna velit aliquip
     * children : [{"name":"ex in","resolve_no":"anim","p_resolve_no":"quis proident consectetur","resolve_type":"ex labore ipsum in","rule_code_resolve_id":"qui veniam moll","company_id":"aute dolor et id incididunt","children":[{},{},{},{}]},{"name":"pariatur ut velit veniam eiusmod","resolve_no":"proident","p_resolve_no":"eu","resolve_type":"irure dolor incididunt","rule_code_resolve_id":"qui tempor","company_id":"qui anim cillum voluptate ad","children":[{},{},{},{},{}]},{"name":"ullamco","resolve_no":"ex qui Ut deserunt","p_resolve_no":"ad consequat elit reprehenderit incididunt","resolve_type":"do occaecat","rule_code_resolve_id":"exercitation culpa cillum eu","company_id":"i","children":[{},{}]},{"name":"et","resolve_no":"id ad labore deserunt voluptate","p_resolve_no":"Lorem magna est id incidi","resolve_type":"dol","rule_code_resolve_id":"d","company_id":"minim dolor mollit pariatur","children":[{},{},{},{}]},{"name":"amet nostrud mollit","resolve_no":"aute minim do dolore ullamco","p_resolve_no":"sunt Duis","resolve_type":"occaecat deserunt","rule_code_resolve_id":"aute qui consectetur sunt dolore","company_id":"dolor ullamco sunt","children":[{},{},{},{}]}]
     */

    private String system_name;
    private String system_no;
    private String company_id;
//    private List<ChildrenBean> children;

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

//    public List<ChildrenBean> getChildren() {
//        return children;
//    }

//    public void setChildren(List<ChildrenBean> children) {
//        this.children = children;
//    }

    @Override
    public String toString() {
        return "CodeRuleResolveRsp{" +
                "system_name='" + system_name + '\'' +
                ", system_no='" + system_no + '\'' +
                ", company_id='" + company_id + '\'' +
                '}';
    }

    public class ChildrenBean{

        /**
         * name : ex in
         * resolve_no : anim
         * p_resolve_no : quis proident consectetur
         * resolve_type : ex labore ipsum in
         * rule_code_resolve_id : qui veniam moll
         * company_id : aute dolor et id incididunt
         * children : [{},{},{},{}]
         */

        private String name;
        private String resolve_no;
        private String p_resolve_no;
        private String resolve_type;
        private String rule_code_resolve_id;//编码分类ruleCodeResolveType 标准码 (例1编码规则分类，2流水段分类)
        private String company_id;
        private List<SubChildrenBean> children;//子集同上（type=2时存在）

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getResolve_no() {
            return resolve_no;
        }

        public void setResolve_no(String resolve_no) {
            this.resolve_no = resolve_no;
        }

        public String getP_resolve_no() {
            return p_resolve_no;
        }

        public void setP_resolve_no(String p_resolve_no) {
            this.p_resolve_no = p_resolve_no;
        }

        public String getResolve_type() {
            return resolve_type;
        }

        public void setResolve_type(String resolve_type) {
            this.resolve_type = resolve_type;
        }

        public String getRule_code_resolve_id() {
            return rule_code_resolve_id;
        }

        public void setRule_code_resolve_id(String rule_code_resolve_id) {
            this.rule_code_resolve_id = rule_code_resolve_id;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }

        public List<SubChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<SubChildrenBean> children) {
            this.children = children;
        }

        public class SubChildrenBean {
            private String name;
            private String resolve_no;
            private String p_resolve_no;
            private String resolve_type;
            private String rule_code_resolve_id;
            private String company_id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getResolve_no() {
                return resolve_no;
            }

            public void setResolve_no(String resolve_no) {
                this.resolve_no = resolve_no;
            }

            public String getP_resolve_no() {
                return p_resolve_no;
            }

            public void setP_resolve_no(String p_resolve_no) {
                this.p_resolve_no = p_resolve_no;
            }

            public String getResolve_type() {
                return resolve_type;
            }

            public void setResolve_type(String resolve_type) {
                this.resolve_type = resolve_type;
            }

            public String getRule_code_resolve_id() {
                return rule_code_resolve_id;
            }

            public void setRule_code_resolve_id(String rule_code_resolve_id) {
                this.rule_code_resolve_id = rule_code_resolve_id;
            }

            public String getCompany_id() {
                return company_id;
            }

            public void setCompany_id(String company_id) {
                this.company_id = company_id;
            }
        }
    }
}
