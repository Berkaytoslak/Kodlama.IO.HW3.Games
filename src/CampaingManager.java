public class CampaingManager implements CampaingServices{

    @Override
    public void add(Campaing campaing) {
        System.out.println(campaing.getCampaingName()+" kampanya eklendi");
    }

    @Override
    public void delete(Campaing campaing) {
        System.out.println(campaing.getCampaingName()+" kampanya silindi");

    }

    @Override
    public void update(Campaing campaing) {
        System.out.println(campaing.getCampaingName()+" kampanya güncellendi");
    }
    public double newPrice(Games games,Campaing campaing){
       return (games.getPrice()*campaing.getCampaingDiscountRate())/100;

    }
}
