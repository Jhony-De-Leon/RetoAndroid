Pareja: Jhony Abraham de León Pérez  
Mariana A lejandra Garc ía Hernández  
Prompts utilizados con GitHub Copilot o Google Gemini :  
Se utilizo un promt tomando  como base las indicaciones que usted nos pudo 
proporcionar el cual se a mplio con ayuda de Chatgpt para que el agente de copilot 
pudiera responder y hacer de una mejor manera.  
Promt utilizado :  
Voy a realizar una aplicación móvil en Android Studio , utilizando el lenguaje Java, que 
tendrá como propósito principal ayudar al usuario a decidir qué comer en el día de 
una manera práctica y visualmente atractiva.  
Descripción de la App:  
La aplicación se llamará “¿Qué Comer Hoy?” . El usuario podrá presionar un botón 
principal en la pantalla y, de manera automática, la aplicación realizará una petición a 
la API gratuita TheMealDB . 
• La API devolverá datos en formato JSON, los cuales serán interpretados y 
estructurados dentro de la aplicación para presentarse como una receta 
organizada  y fácil de leer.  
• La receta incluirá:  
o Nombre del platillo  
o Imagen del platillo  (cargada mediante Glide o Picasso ) 
o Lista de ingredientes con sus respectivas cantidades  
o Instrucciones detalladas de preparación  
o Categoría  (ejemplo: postre, plato fuerte, entrada, bebida)  
o País de origen  del platillo  
Funcionalidades principales:  
1. Botón principal de recomendación : al tocarlo, el sistema consumirá el 
endpoint de la API de TheMealDB que genera una receta aleatoria.  

2. Visualización atractiva : los resultados se mostrarán en una tarjeta o pantalla 
dedicada, incluyendo la imagen del platillo, el título y los pasos de preparación 
con un diseño ordenado.  
3. Generación personalizada : además de la receta aleatoria, la aplicación tendrá 
un sistema de prompts internos  que permitan ofrecer recomendaciones 
personalizadas (ejemplo: sugerir recetas según el tiempo de preparación, 
categoría, tipo de comida o preferencia del usuario).  
4. Navegación básica : incluir pantallas mínimas necesarias:  
o Pantalla inicial con el botón principal  
o Pantalla de resultados (receta recomendada)  
o Opcional: historial de recetas vistas  
Objetivos de aprendizaje del proyecto:  
• Consumo de APIs REST en Android : conexión a un servicio web externo que 
devuelve datos en formato JSON.  
• Manejo de imágenes en Android : mostrar imágenes obtenidas desde la API 
usando librerías como Glide o Picasso. 
• Prompts para personalización : implementar pequeños filtros o preguntas 
previas al usuario para enriquecer la experiencia (ejemplo: "¿Prefieres algo 
dulce o salado?" antes de generar la receta).  
• Buenas prácticas en parsing de JSON : estructurar la información cruda de la 
API en un formato más claro, presentando la receta en un lenguaje natural.  
• Diseño de interfaz en Android Studio : construir pantallas visualmente 
atractivas, intuitivas y centradas en la experiencia de usuario (UI/UX).  
Requisitos técnicos mínimos:  
• Android Studio (última versión estable).  
• Lenguaje de programación: Java. 
• Librerías:  
o Glide o Picasso  para manejo de imágenes.  
o Volley o Retrofit  para consumo de APIs.  

• API: TheMealDB  (endpoint de receta aleatoria: 
https://www.themealdb.com/api/json/v1/1/random.php ). 
• Manejo de permisos de internet en el archivo AndroidManifest.xml . 
 
 
○ Resultados obtenidos de cada prompt (código generado, errores, mejoras,  
etc.): Solo se utilizó el promt que se proporcionó  anteriormente , no hubieron 
problemas en el desarrollo sol o algunos aspecto que debían mejorar ya que al inicio 
había fallado la conexión con la API de ahí en adelante ya solo hubieron sugerencias  
ya que el programa no tenía un botón de regresar a la pantalla princi pal y no había 
ningún texto que identificará  a que se basa ba la aplicación.  
○ Problemas encontrados y cómo se resolvieron con IA.  
La conexión con la API no era posible debido a erro res de llam ado que se 
encontraban en el código los pudimos solucionar en conjunto con Copilot.  
○ Reflexión final sobre la experiencia de usar herramientas de IA en el  
desarrollo móvil.  
Es muy bueno pero debo mejorar ya que aun se me dificul ta pensar al momento de 
escribir los p romts, pero todo debe ser prueba y error y tolerancia al fallo.  
Se adjunta imágenes  de la aplicación funcionando :  
 

