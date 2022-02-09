import { BrowserRouter, Routes, Route,} from "react-router-dom";
import Home from "./Views/Home.jsx";
import Passagens from "./Views/Passagens.jsx";
import Pacotes from "./Views/Pacotes.jsx";
import Cadastro from "./Views/Cadastro.jsx";
import Menu from "./Components/Menu.jsx";
import Footer from "./Components/Footer.jsx";
import "./Layout/Menu.css";
import "./Layout/Form.css";
import "./Layout/Footer.css";
import "./Layout/Fundo.css";
import "./Layout/cadback.css";


function App() {
  return(
    <>
      <BrowserRouter>
          <Menu />
            <Routes>
            <Route path="/" element={<Home/>} />
            <Route path="/Passagens" element={<Passagens/>} />
            <Route path="/Pacotes" element={<Pacotes/>} />
            <Route path="/Cadastro" element={<Cadastro/>} />
            </Routes>
      </BrowserRouter>
<Footer />    
    </>
 ); 
}

export default App;