@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteCadastroService service;

    public ClienteController(ClienteCadastroService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrar(@Valid @RequestBody ClienteRequest request) {
        return ResponseEntity.ok(service.cadastrar(request));
    }
}