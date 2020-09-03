package ${packageName};

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ${className} {
    <#list params as param>
    // ${param.fieldNote}
    private ${param.fieldType} ${param.fieldName};

    </#list>

    @Getter
    @Setter
    public static class ${subClassName}{
        <#list subParams as subParam>
            // ${subParam.subFieldNote}
            private ${subParam.subFieldType} ${subParam.subFieldName};
        </#list>
    }
}