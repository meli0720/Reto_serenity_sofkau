#language:es
#encoding:UTF-8
#Author: Melissa Meneses Acevedo

Característica: Flujo de Compra en la pagina Web PideColanta
  yo como usuaria de la pagina Web  PideColanta
  quiero poder comprar productos en la pagina
  para poder recibirlos en mi domicilio

  @Compra
  Escenario: : El usuario completa un flujo de compra en la pagina web
    Dado que estoy en la pagina web PideColanta
    Y me he logueado correctamente
    Cuando agrego un producto a mi carrito y continuo todo el flujo de la compra
    Entonces deberia ver un mensaje de confirmacion de compra exitosa