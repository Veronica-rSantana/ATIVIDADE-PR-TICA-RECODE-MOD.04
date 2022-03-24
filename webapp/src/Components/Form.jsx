import React from "react";

export default function Cadastro() {
    return (
        <>
         <div className="imgFundo"/>
             <form className="cadastro">
                <h2>Informe seus dados para realizar o cadastro.</h2>                       
                    <div class="form-row">
                        <div class="form-group col-md-6">                        
                            <input type="email" class="form-control" id="inputNome" placeholder="Nome completo"/>
                        </div>
                            <div class="form-group col-md-6">                        
                                <input type="text" class="form-control" id="inputCpf" placeholder="CPF"/>
                            </div>
                            <div class="form-group col-md-6">                        
                                <input type="text" class="form-control" id="inputEmail" placeholder="E-mail"/>
                            </div>
                            <div class="form-group col-md-6">                        
                                <input type="text" class="form-control" id="inputTelefone" placeholder="Telefone"/>
                            </div>
                            </div>
                            <div class="form-group">               
                                    <input type="text" class="form-control" id="inputEndereco" placeholder="Rua dos Bobos, nº 0"/>
                            </div>
                                <div class="form-group">                
                                    <input type="text" class="form-control" id="inputAddress2" placeholder="Bairro"/>
                                </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="inputCity">Cidade</label>
                                    <input type="text" class="form-control" id="inputCity"/>
                                </div>
                            <div class="form-group col-md-4">
                            <label for="inputEstado">Estado</label>
                            <select id="inputEstado" class="form-control">
                            <option selected>Escolher...</option>
                                <option>Acre</option>
                                <option>Alagoas</option>
                                <option>Amapá</option>
                                <option>Amazonas</option>
                                <option>Bahia</option>
                                <option>Ceará</option>
                                <option>distrito Federal</option>
                                <option>espirito Santo</option>
                                <option>Goiás</option>
                                <option>Maranhão</option>
                                <option>Mato Grosso</option>
                                <option>Mato Grosso do Sul</option>
                                <option>Minas Gerais</option>
                                <option>Pará(PA)</option>
                                <option>Paraíba</option>
                                <option>Paraná</option>
                                <option>Pernambuco</option>
                                <option>Piauí</option>
                                <option>Rio de janeiro</option>
                                <option>Rio Grande do Norte</option>
                                <option>Rio Grande do Sul</option>
                                <option>Rondônia</option>
                                <option>Roraima</option>
                                <option>Santa Catarina</option>
                                <option>São Paulo</option>
                                <option>Sergiipe</option>
                                <option>Tocantins</option>
                            </select>
                            </div>
                            <div class="form-group col-md-2">
                                <label for="inputCEP">CEP</label>
                                <input type="text" class="form-control" id="inputCEP"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" id="gridCheck"/>
                                <label class="form-check-label" for="gridCheck">
                                Clique em mim
                                </label>
                            </div>
                    </div>
                    <button type="button" class="btn btn-outline-primary">Enviar</button>                   
            </form>                     
            
        </>
    );
}
     
        
      