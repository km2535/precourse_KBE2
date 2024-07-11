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
 - 예외처리의 우선순위설정하기
### validation 
- validation 세팅하기
- validation exception 처리 핸들링 하기 
- 어노테이션만들기 
- validation  AssertTrue 이용하기

## Chapter4
### Memory DataBase 


## Chapter5
### MYSQL & DOCKER
- MySql과 타입 매칭 시 주의
  - int primitive 타입을 사용하면 default의 값이 0이기 때문에 null 또는 not null 옵션을 가진 sql 타입과 타입 매칭 에러가 
  발생 할 수 있으므로 reference타입을 사용해야 한다.(int x , Integer)

## Chapter6
### JDBC와 JPA
- 데이터베이스 연결
- JDBC는 날것의 로우한 코드를 작성하게 되어 굉장히 번거로움
- JPA를 통해 JAVA ORM 기술에 대한 인터페이스
  - 인터페이스를 통해 데이터베이스에 접근 할 수 있도록 함
### Hibernate 
- JPA의 인터페이스를 구현한 라이브러리 
- 구현체를 좀 더 쉽게 이용할 수 있도록 구현한 라이브러리 
```java
EntityManager entityManager= entityManager.getTransaction().begin();
var user = new User(“홍길동”, 20, “hong@gmail.com”);
entityManager.persist(user);
entityManager.getTransaction().commit();
entityManager.close();
```
위와 같이 개선 되어도 번거로움이 존재한다.
스프링은 어노테이션으로 작성 할 수 있도록 도와줌
```java
@Transactional
public User save(User user) {
return userRepository.save(user);
}
```
 
 