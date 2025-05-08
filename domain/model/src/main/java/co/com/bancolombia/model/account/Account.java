package co.com.bancolombia.model.account;
import co.com.bancolombia.model.account.exceptions.BusinessException;
import co.com.bancolombia.model.account.exceptions.message.BusinessErrorMessage;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
public class Account {

    private final long id;
    private final String name;
    private final String status;

    public static Account newAccount(long id, String name, String status) {
        if(name.equals("error")) {
            throw new BusinessException( BusinessErrorMessage.ACCOUNT_VALIDATION_ERROR );
        }

        return new Account(id, name, status);
    }

}
