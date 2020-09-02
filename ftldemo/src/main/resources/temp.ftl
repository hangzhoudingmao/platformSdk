package ${packageName};

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ${className} {
    <#list params as param>
	    // ${param.fieldNote}
        private ${param.fieldType} ${param.fieldName};
    </#list>
}