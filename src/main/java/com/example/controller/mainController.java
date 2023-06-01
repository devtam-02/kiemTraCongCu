@RestController(path = "/test")
public class mainController(){
    @GetMapping()
    public void getAllRecord(){
        String name = "tam";
        System.out.println(name);
    }
}