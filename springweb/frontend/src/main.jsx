import { createRoot } from "react-dom/client";
const root = document.querySelector( '#root' );
const create = createRoot( root );


// import Test from "./dddd/Test";
// create.render(<Test> </Test>)

import { BrowserRouter } from "react-router-dom";
import App from "./day13/App";
create.render(<BrowserRouter> </BrowserRouter>)
