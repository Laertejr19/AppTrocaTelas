# 🔄 App Troca Telas

Aplicativo Android simples desenvolvido em **Java + XML** no **Android Studio**, que permite ao usuário navegar entre diferentes telas (Activities) com botões.  
Projeto criado como parte dos estudos de **desenvolvimento mobile nativo** e para praticar navegação entre telas no Android.

---

## 🧠 Sobre o Projeto

O **App Troca Telas** oferece uma interface com botões que, ao serem clicados, navegam para outras telas do aplicativo.  
O objetivo é demonstrar como implementar navegação entre Activities utilizando `Intent`.

---

## 🛠️ Tecnologias Utilizadas

| Categoria         | Ferramenta                         |
|-------------------|------------------------------------|
| IDE               | Android Studio                     |
| Linguagem         | Java                               |
| Layouts           | XML                                |
| Versão mínima Android | API 21 (Android 5.0)             |
| Estrutura de UI   | ConstraintLayout / LinearLayout    |

---

## 📱 Estrutura do Projeto

```
app/
 ├── java/
 │    └── br/ulbra/apptrocatelas/
 │         ├── MainActivity.java
 │         └── SegundaActivity.java
 ├── res/
 │    ├── layout/
 │    │     ├── activity_main.xml
 │    │     └── activity_segunda.xml
 │    ├── drawable/
 │    │     └── (ícones ou imagens do app)
 │    └── values/
 │          └── strings.xml
 └── AndroidManifest.xml
```

---

## 🧩 Lógica de Navegação

```java
Button btnTrocarTela = findViewById(R.id.btnTrocarTela);
btnTrocarTela.setOnClickListener(v -> {
    Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
    startActivity(intent);
});
```

---

## 🏗️ Funcionalidades Implementadas

✅ Navegação entre telas utilizando `Intent`  
✅ Interface simples com botões de navegação  
✅ Código comentado para entendimento  

---

## 💡 Possíveis Melhorias

- Adicionar animações de transição entre telas  
- Implementar navegação com `Fragments`  
- Criar um menu de navegação lateral (Navigation Drawer)  
- Adicionar ícones personalizados nos botões  
- Implementar navegação com `ViewPager` ou `Navigation Component`  

---

## 👩‍💻 Autor

**Nome:** *Laerte Ferraz da Silva Júnior*  
**Instituição:** *Curso Técnico em Informática – Escola Ulbra São Lucas*  
**Disciplina:** *Desenvolvimento Mobile Android*  
**Professor:** *Jeferson Leon*  

---

## 📚 Licença

Projeto desenvolvido para fins **educacionais**.  
Livre para uso e modificação, desde que mantidos os créditos ao autor.

---

> “A melhor forma de aprender é construindo. Então... bora codar!”
