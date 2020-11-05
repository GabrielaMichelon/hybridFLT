## This repository contains a runtime adapter added to the [ECCO](https://github.com/jku-isse/ecco/tree/develop) implementation to perform a hybrid feature location technique (dynamic and static analysis).
---
Get the code: `git clone` or download zip file into `<working_dir>`.

Requires:
* JDK 13.
* Gradle as build system.
---

## IDE

IntelliJ supports Gradle out of the box. Just import the project as a Gradle project.

---
## New Adapter
*runtime* module contains class __RuntimeModuleTest.java__  test __Create_Repo()__, which you can execute to perform the static analysis based on runtime monitoring traces.

## Existing Adapter
*service* module contains class __RuntimeTest.java__ test __testCheckout()__, which you can execute after having the features traced to compose new variants.
