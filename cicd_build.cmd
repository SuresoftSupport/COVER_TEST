mvn clean source:jar com.qualityscroll.cover:jacov-maven-plugin:4.0.6-jre17-SNAPSHOT:setup compile package -Dmaven.jacov.addDependencyJavaLib=true
cd .\target
xcopy .\cover-demo.war C:\apache-tomcat-9.0.112\webapps /Y