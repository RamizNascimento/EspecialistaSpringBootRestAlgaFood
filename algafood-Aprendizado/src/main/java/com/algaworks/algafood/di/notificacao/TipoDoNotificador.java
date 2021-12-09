package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;



public interface TipoDoNotificador {

	NivelUrgencia value();
}
