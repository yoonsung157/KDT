import { createRoot } from "react-dom/client";
const root = document.querySelector( '#root' );
const create = createRoot( root );
import ProductManager from "./ProductManager";
create.render(<ProductManager> </ProductManager>)