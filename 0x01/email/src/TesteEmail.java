import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TesteEmail {

    @Test
    public void testar_email_com_arroba(){
        String email = "email_teste@dominio.com.br";

        assertTrue(Pessoa.emailValid(email));
    }

    @Test
    public void testar_email_sem_arroba(){
        String email = "testar_email_sem_arroba";

        assertFalse(Pessoa.emailValid(email));
    }

    @Test
    public void testar_email_mais_50_caracteres(){
        String email = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";

        assertEquals(false, Pessoa.emailValid(email));
    }
}
