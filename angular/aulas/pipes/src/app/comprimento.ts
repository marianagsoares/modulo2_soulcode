import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'comprimento'
})
export class LenghtArrayPipe implements PipeTransform {

  /**Com o transform nós queremos pegar um array e indicar o lenght dele */
  /*value: parâmetro responsável por pegar o valor que será transformado*/
  /*por padrão o argumento é unknown*/
  /*mas queremos um array de qualquer valor any[]*/
  //Tambem e possivel passar outros parametros a: string por exemplo
  //...args: unknown[] rest operator 

   transform(value: any[]): number { 
    //number por que vai retornar a quantidade de itens dentro do array
    return value.length;
  }

}
