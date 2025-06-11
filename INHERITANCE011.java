
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


abstract class Asset{
    private String name;
    private double value;
    private Date acquisitionDate;

    public Asset(String name, double value, Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
        this.name = name;
        this.value = value;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    abstract double getDepreciation();
    
}

class FixedAsset extends Asset{
    private double usefulLife;

    public FixedAsset(String name, double value, Date acquisitionDate, double usefulLife) {
        super(name, value, acquisitionDate);
        this.usefulLife = usefulLife;
    }
    
    double getDepreciation(){
        return getValue()/this.usefulLife;
    }

    public double getUsefulLife() {
        return usefulLife;
    }
}

class CurrentAsset extends Asset{
    private double liquidationValue;

    public CurrentAsset(String name, double value, Date acquisitionDate,  double liquidationValue) {
        super(name, value, acquisitionDate);
        this.liquidationValue = liquidationValue;
    }
    
    double getDepreciation(){
        return getValue()*0.1;
    }

    public double getLiquidationValue() {
        return liquidationValue;
    }
}

class IntangibleAsset extends Asset{
    private double amortizationPeriod;

    public IntangibleAsset(String name, double value, Date acquisitionDate, double amortizationPeriod) {
        super(name, value, acquisitionDate);
        this.amortizationPeriod = amortizationPeriod;
    }

    double getDepreciation(){
        return getValue()/this.amortizationPeriod;
    }

    public double getAmortizationPeriod() {
        return amortizationPeriod;
    }
}

class AssetManager{
    private ArrayList<Asset> assets;

    public AssetManager() {
        this.assets = new ArrayList<Asset>();
    }

    void AddAsset(Asset asset){
        this.assets.add(asset);
    }
    public double getTotalValue(){
        double totalValue = 0;
        for(Asset asset : this.assets){
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    public double getTotalDepreciation(){
        double totalDepreciation = 0;
        for(Asset asset : this.assets){
            totalDepreciation += asset.getDepreciation();
        }
        return totalDepreciation;
    }
    
    public ArrayList<Asset> getAssets() {
        return assets;
    }
    
    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }
}

public class INHERITANCE011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AssetManager assetManager = new AssetManager();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String type = sc.next();
            if(type.equals("FixedAsset")){
                FixedAsset fixedAsset = new FixedAsset(sc.next(), sc.nextDouble(), new Date(), sc.nextDouble());
                assetManager.AddAsset(fixedAsset);
            }
            else if(type.equals("CurrentAsset")){
                CurrentAsset currentAsset = new CurrentAsset(sc.next(), sc.nextDouble(), new Date(), sc.nextDouble());
                assetManager.AddAsset(currentAsset);
            }
            else if(type.equals("IntangibleAsset")){
                IntangibleAsset intangibleAsset = new IntangibleAsset(sc.next(), sc.nextDouble(), new Date(), sc.nextDouble());
                assetManager.AddAsset(intangibleAsset);;
            }
        }
        for(Asset asset:assetManager.getAssets()){
            System.out.println("Asset Name: "+asset.getName());
            System.out.println("Asset Value: "+String.format("%.1f",asset.getValue()));
            System.out.println("Depreciation: "+String.format("%.1f",asset.getDepreciation()));
            System.out.println("---------------------------");
        }
        System.out.println("Total Value of Assets: "+String.format("%.1f" ,assetManager.getTotalValue()));
        System.out.println("Total Depreciation of Assets: "+String.format("%.1f",assetManager.getTotalDepreciation()));
    }
}
