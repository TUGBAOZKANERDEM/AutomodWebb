Feature:Kullanıcı “Aller-Retour” seçeneğinin ardından De, À, Départ seçeneklerini doldurup, farklı yerleşim yeri ve ulaşım araçlarının farklı CO2 emisyon sonuçları verdiğini görebilmeli.
 Scenario:Kullanıcı “Itinéraire” başlığı altında dropdowndan “Aller-retour” seçeneğindeki ilgili alanları doldurabildikten sonra karbon emisyon değerini görebilmeli
    When kullanıcı dropdowna tıklar.
    Then Kullanıcı Dropdowndan Aller retour seçeneğini seçer.
    And Kullanıcı De kutusuna tıklar.
    And KUllanıcı De kutusuna bir yerleşim yeri girer.
    And Kullanıcı A kutusuna tıklar.
    And Kullanıcı A kutusuna bir yerleşim yeri girer.
    And Kullanıcı Aller kutusuna tıklar.
    And Kullanıcı Aller kutusuna takvimden tarih seçer.
    And Kullanıcı Aller kutusundan saate tıklar.
    And Kullanıcı Aller kutusundan saat seçer.
    And Kullanıcı Retour kutusuna tıklar.
    And kullanıcı Retour kutusundan tarih seçer.
    And Kullanıcı Retour kutusundan saate tıklar.
    And Kullanıcı Retour kutusundan saat seçer.
    And Kullanıcı Rechercher butonuna tıklar.
    Then Kullanıcı Transport en commun başlığını görür.
    And Kullanıcı arama sonuçlarından herhangi birini seçer.
    And Kullanıcı Voir les étapes butonuna tıklar.
    Then Kullanıcı Karbon emisyon değerini görür.

    @wip
   Scenario: Kullanıcı başka bir yerleşim yeri için Co2 emisyon değerinin değiştiğini görebilmeli
      When kullanıcı dropdowna tıklar.
      Then Kullanıcı Dropdowndan Aller retour seçeneğini seçer.
      And Kullanıcı De kutusuna tıklar.
      And KUllanıcı De kutusuna farklı bir yerleşim yeri girer.
      And Kullanıcı A kutusuna tıklar.
      And Kullanıcı A kutusuna farklı bir yerleşim yeri girer.
      And Kullanıcı Aller kutusuna tıklar.
      And Kullanıcı Aller kutusuna takvimden tarih seçer.
      And Kullanıcı Aller kutusundan saate tıklar.
      And Kullanıcı Aller kutusundan saat seçer.
      And Kullanıcı Retour kutusuna tıklar.
      And kullanıcı Retour kutusundan tarih seçer.
      And Kullanıcı Retour kutusundan saate tıklar.
      And Kullanıcı Retour kutusundan saat seçer.
      And Kullanıcı Rechercher butonuna tıklar.
      Then Kullanıcı Transport en commun başlığını görür.
      And Kullanıcı arama sonuçlarından herhangi birini seçer.
      And Kullanıcı Voir les étapes butonuna tıklar.
      Then Kullanıcı karbon emisyon değerinin değiştiğini görür.





