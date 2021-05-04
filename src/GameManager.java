public class GameManager implements GamesServices{
    @Override
    public void add(Games games) {
        System.out.println(games.getName()+" adlı oyun eklendi.");
    }

    @Override
    public void delete(Games games, Customer customer) {
        System.out.println(customer.getName()+":"+games.getName()+" adlı oyun sildi.");

    }

    @Override
    public void update(Games games, Customer customer) {
        System.out.println(customer.getName()+":"+games.getName()+" adlı oyun güncellendi.");

    }
}
