import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ListarProdutosComponent } from "./pages/listar-produtos/listar-produtos.component";



const rotas: Routes = [
    {
        //http://localhost:4200/
        path:"", //rota pra mostrar os produtos
        component:ListarProdutosComponent
    },

]
//Modulo principal
@NgModule({
  declarations:[],
  imports:[
    RouterModule.forRoot(rotas) //configura todas as rotas com o forRoot.
  ],
  providers:[],
  exports: [
    RouterModule //exporta todas as rotas configuradas
  ]  
})
export class AppRouterModule{}