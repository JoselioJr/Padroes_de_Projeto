const ServidorReal = require("./ServidorReal");

class ProxyServidor {
  constructor(usuario) {
    this.usuario = usuario;
    this.servidorReal = new ServidorReal();
  }

  acessarRecurso() {
    if (this.usuario.role === "admin") {
      return this.servidorReal.acessarRecurso();
    } else {
      return "⛔ Acesso negado: você não tem permissão.";
    }
  }
}

module.exports = ProxyServidor;