## 1차 요구사항 구현
- [x] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [x] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [x] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [x] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [x] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [x] 게시글 상세 페이지에는 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
- 전부 완료 
- @PostMapping("/create")
  public String articleCreate (@RequestParam(value = "subject") String subject, @RequestParam(value = "subject") String content) {
  this.articleService.create(subject, content);
  return "redirect:/article/list";
  }
- 위에 부분에서 @RequestParam에 value 값 안넣어준 것 때문에 계속 오류떠서 상당 시간 소요했습니다.
- 그래서 css부분 구현하지 못했습니다.

## MVC 패턴
- 소프트웨어 디자인 패턴 중 하나로 Model, View, Controller 3가지로 구분된다.

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- @Autowired
- 생성자
- Setter

## JPA의 장점과 단점
#### 장점
- 객체-관계 매핑으로 객체 지향적 설계를 유지하며 데이터베이스와 상호작용 가능
- 코드간 간소화와 유지보수 용이성으로 생산성 향상
- 트랜잭션 관리를 자동으로 처리하여 일관성 유지

#### 단점
- 학습 곡선이 존재하며, ORM 개념을 익히는데 시간이 소요됌
- 일부 상황에서는 성능 오버헤드가 발생할 수 있다.
- 복잡한 쿼리 작성이 어려울 수 있다.
- DBMS 종속성으로 구현체에 따라 동작이 다르며, 최적화를 위해서는 특정 DBMS에 맞는 설정이 필요하다.

## HTTP GET 요청과 POST 요청의 차이
#### GET
- 데이터는 URL의 일부로 전송되며, 쿼리 파라미터를 통해 데이터가 전달되며, URL에 노출되므로 보안에 취약할 수 있다.
- URL 길이에 제한이 있으므로 전송할 수 있는 데이터 양이 제한적이다.
- 요청을 하면 캐시될 수 있고, 동일한 요청이 여러 번 수행되더라도 동일한 응답을 받을 수 있다.
- 브라우저의 주소 표시줄에 나타날 수 있으므로 북마크 할 수 있다.
#### POST
- 데이터는 HTTP 요청의 본문에 포함되어 전송되며, 더 많은 데이터를 전송할 수 있으며, URL에 노출되지 않기 때문에 보안성이 더 높다.
- 본문에 데이터를 포함하기 때문에 보다 더 많은 양의 데이터를 전송할 수 있다.
- 캐시되지 않으며, 요청은 명시적으로 캐시 헤더를 설정하지 않는 한 캐시되지 않는다.
- 주소 표시줄에 나타나지 않으므로 북마크할 수 없다.
