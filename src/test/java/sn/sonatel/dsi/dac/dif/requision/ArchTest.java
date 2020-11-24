package sn.sonatel.dsi.dac.dif.requision;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("sn.sonatel.dsi.dac.dif.requision");

        noClasses()
            .that()
            .resideInAnyPackage("sn.sonatel.dsi.dac.dif.requision.service..")
            .or()
            .resideInAnyPackage("sn.sonatel.dsi.dac.dif.requision.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..sn.sonatel.dsi.dac.dif.requision.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
