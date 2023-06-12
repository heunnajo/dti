package sbms.dti;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Dti {

    @Id
    private String conversationID;
    private String supBuyType;
    private String direction;
    private String dtiWDate;
    private String dtiType;
    private String taxDemand;
    private String supComRegno;
    private String supRepName;
    private String supComName;
    private String supComAddr;
    private String byrComRegno;
    private String byrRepName;
    private String byrComName;
    private String byrComAddr;
    private String byrEmail;
    private String supAmount;
    private String taxAmount;
    private String totalAmount;
    private String DttYn;
    private String businessTypeCode;//공급받는 자 사업자등록번호 구분코드. main에 x
    private String sequenceNumber;//일련번호. main에 x
    private String supplyValue;//공급가액. main에 x
    private String dtiStatus;//세금계산서. 상태main에 x
}
