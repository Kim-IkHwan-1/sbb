# Chapter 2

@RequiredArgsConstructor : 롬복(Lombok)이 제공하는 애너테이션으로, final이 붙은 속성을 포함하는 생성자를 자동으로 만들어 주는 역할을 한다.

Model : Model 객체는 자바 클래스(Java class)와 템플릿(template) 간의 연결 고리 역할을 한다. 

@PathVariable : 변하는 id값을 얻을 때 사용

@RequestMapping(/question) : URL매핑 시에 /question을 프리픽스로 시작하도록 할 수 있다. 

@PostMapping : @GetMapping과 동일하게 URL매핑을 담당하는 역할을 하지만, POST요청을 처리하는 경우에 사용된다.