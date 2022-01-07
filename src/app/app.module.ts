import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { PessoaComponent } from './components/pessoa/pessoa.component';
import { AplicacaoComponent } from './components/aplicacao/aplicacao.component';
import { FornecedorComponent } from './components/fornecedor/fornecedor.component';
import { PessoaFormComponent } from './components/pessoa-form/pessoa-form.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { PessoaService } from './services/pessoa.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PessoaComponent,
    AplicacaoComponent,
    FornecedorComponent,
    PessoaFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    CommonModule
  ],
  providers: [
    HttpClient,
    PessoaService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
