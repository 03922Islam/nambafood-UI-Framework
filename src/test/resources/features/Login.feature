Feature: Namba Food Login

  Background:
    Given  Я как пользователь должен зайти на сайт https://nambafood.kg/

    @Test1
    Scenario: Пользоветь должен успешно войти в систему с валидными данными
      Given Пользователь должен нажать на кнопку войти
      When Пользователь входит в систему с этими данными
      |userName|passWord|
      |love_isa_94@mail.ru|ermekovislam1994|
      Then Пользователь должен успешно зайти в систему

    @Test2
      Scenario: Пользователь должен ввести неправильные данные и должен увидит ошибку
        Given Пользователь должен нажать на кнопку войти
        When Пользователь входит в систему с этими данными
          |userName             |passWord    |
          |elonMusk@mail.ru     |12345       |
          |donaldTramp@mail.ru  |125555      |
          |BarakAbama@mail.ru   |1234533333  |
          |ErmekovISlam@mail.ru |123451111111|
          |MusakunovMusk@mail.ru|123453333333|

        Then Пользователь должен увидит ошибку "Неправильные email и/или пароль"