import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-uploader',
  templateUrl: './uploader.component.html',
  styleUrls: ['./uploader.component.css']
})
export class UploaderComponent {
  //EventEmitter e uma classe costumizada que permite criar eventos customizados
  @Output()
  //Output é uma propriedade que será transformada em um evento personalizado
  uploadCompleto: EventEmitter<string> = new EventEmitter<string>()
  //emissao de evento personalizado


//fazerUpload é um método
  fazerUpload(){
    alert("upload iniciado")
    this.uploadCompleto.emit()
    /*o metodo emit serve para iniciar o evento personalizado que eu criei com EventEmitter*/
  }

}
