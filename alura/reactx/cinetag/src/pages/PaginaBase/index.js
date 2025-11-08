import { Outlet } from "react-router-dom";
import Cabecalho from "../../components/Cabecalho";
import FavoritosProvider from "../../contextos/Favoritos";
import Container from "../../components/Container";

function PaginaBase() {
  return (
    <main>
      <Cabecalho />
      <FavoritosProvider>
        <Container>
          <Outlet />
        </Container>
      </FavoritosProvider>
    </main>
  );
}
export default PaginaBase;
