import React from 'react';

function Jumbotron(){
    return(
    <>
      <div className="jumbotron">
            <div className="d-flex justify-content-center" style={{width:"100%"}}>
              <img src='../img/fundo.jpg'style={{width:"100%"}} alt="" ></img>
            </div>
          
              <h1 className="display-4">Olá,</h1>
              <p className="lead">A Vs Agência Viagens & Turimo, é uma agência de viagens baiana, especializada em atendimentos e pragamação de roteiros incríveis, proporcionando conforto,praticidade e segurança para você e toda sua família. Além de oferecer os melhores preços e condições para melhor programar sua diversão.<br/>
                  <br/> Nós da VS, estamos felizes por tê-lo(as) conectado(as) conosco. Estamos preparados e qualificados para prestar os melhores serviços. Aproveite a visita e confira nossas programações e promoções!</p>
              <hr className="my-4"/>
              <h1>Partiu programar sua próxima viagem?</h1>
              <p className="lead">
              <a className="btn btn-primary btn-lg"  role="button">Clique aqui</a>
            </p>
      </div>
    </>
  );
}
export default Jumbotron;