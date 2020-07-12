# List of practiced topics

## Configuration
1. Spring Boot configuration with dependencies 
[[Reference]()]
   - Spring Web
   - Thymeleaf
   - Spring Boot DevTools (Optional)
2. Create Controllers 
[[DemoController]()]
3. Create HTML view pages 
[[home.html]()]
   - Add ```<html xmln:th="http://www.thymeleaf.org">``` to support Thymeleaf expressions 
   - Add ```<link rel="stylesheet" th:href="@{<path_from_resources_folder/url>}" />``` to apply CSS style
4. Apply CSS style

## Thymeleaf Expressions 
[[list-employees.html]()]
- ```<p th:text="<text>" />```
- ```<tr th:each="<tempVar> : ${<model>}">``` 

## Notes/Tips
- Run project as Java app
- View pages in ```src/main/resource/templates```
- Local CSS in ```src/main/resources/static``` (recommend creating sub-directory for CSS files, like ```css```)
- Remote Bootstrap 
[[URL](https://getbootstrap.com/docs/4.5/getting-started/introduction/#starter-template)]
  - Copy meta and link tags
  - Wrap content inside ```<div class="container">```








