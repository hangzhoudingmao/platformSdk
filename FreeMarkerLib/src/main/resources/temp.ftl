package com.tenny.${interfaceName?lower_case}.entity;

import java.util.Date;

@Getter
@Setter
public class ${beanName} {

<#list params as param>
	// ${param.fieldNote}
    private ${param.fieldType} ${param.fieldName};

</#list>

}