# PreCourse KBE2 
## Chapter2
### getMethod
### postMethod
### putMethod
#### is메소드 
#### log와 System.out.print
### DeleteMethod

## Chapter3
### HttpStatus
- Status 조작을 통한 "client"에게 "Response"하기
### Object Mapper
#### Jackson 라이브러리의 동작 방식
- Json ---- 역직렬화 ----> DTO
- Json <--- 직렬화 ----- DTO
- objectMapping 시 메소드에 매핑이 되는 것임 
  - 직렬화 시에 get 메소드에 매핀
- 엔티티에 "JsonProperty"로 임의 매핑이 가능함
### 예외처리
 - 글로벌 하게 예외 처리하기
 - RestControllerAdvice 어노테이션으로 컨트롤러 만들기
 - ExceptionHandler 어노테이션으로 처리하는 컨트롤러 별도로 만들어서 처리하기