const express = require("express");
const ProxyServidor = require("./ProxyServidor");

const app = express();
app.use(express.json());

const UsuarioBuilder = require("./UsuarioBuilder");

app.use((req, res, next) => {
  req.usuario = new UsuarioBuilder()
    .setNome("Tester")
    .setRole(req.headers["x-role"] || "user")
    .build();
  next();
});

app.get("/recurso-protegido", (req, res) => {
  const proxy = new ProxyServidor(req.usuario);
  const resultado = proxy.acessarRecurso();
  res.send(resultado);
});

app.listen(3000, () => {
  console.log("Servidor rodando em http://localhost:3000");
});