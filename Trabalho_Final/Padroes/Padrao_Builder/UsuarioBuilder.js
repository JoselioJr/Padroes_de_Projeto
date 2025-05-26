class UsuarioBuilder{
    constructor(){
        this.usuario={};
    }
    setNome(nome) {
    this.usuario.nome = nome;
    return this;
}
    setRole(role) {
    this.usuario.role = role;
    return this;
}
    build() {
    return this.usuario;
}
}
module.exports = UsuarioBuilder;