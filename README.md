#QAzando Web Test

Projeto de automação de testes web, com Selenium Webdriver + Java.

Obs.:
Implementando melhorias.

Java: 8
Report: cluecumber (é gerado na pasta target\formated-report)

`Executando os teste no Chrome:`
`mvn test -Dtest=RunnerCucumberTest cluecumber-report:reporting -Dbrowser=chrome`

`Executando os testes no Firefox:`
`mvn test -Dtest=RunnerCucumberTest cluecumber-report:reporting -Dbrowser=firefox`