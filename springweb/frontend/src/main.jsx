import { createRoot } from "react-dom/client";
const root = document.querySelector( '#root' );
const create = createRoot( root );
import CategoryManager from "./CategoryManager";
create.render(<CategoryManager> </CategoryManager>)