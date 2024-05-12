# Notes

## Contoller

- @RequestParam("name") string name
  merupkan parameter yang mengambil nilai dari _URL_
- @PathVariable("id") Long id
  merupakan paramter yang diambil langsung dari url ?
- @RequestBody Product product
  merupakan parameter yang diambil langsung dari body

## Models

- Repositories
  - Berfungsi untuk menghubungkan JPA yang berfungsi untuk CRUD dan membuat Querry di database
- @GeneratedValue(strategy = GenerationType.IDENTITY)
  - Berfungsi untuk auto increment
- public interface ProductRepo extends CrudRepository<Product,Long>
  - Pada repo ini menggunakan interface bukan class dan mengekstend Crus yang berisi kurung siku
    - <Name Entity yang dipakai, tipe data primary keynya nya>

## Services

- Berisi Bisnis LOGIC atau bisnis Proses. Flownya ada disini, misal mengecek tabel apakah datanya ada atau tidak.
- Perlu menginject dengan REPO menggunakan AutoWired

## Validaton

- @NotEmpty di bagian entities dengan messagenya dengan menambahkan @Valid di controller dan ditambahkan error
  - public Product create(@Valid @RequestBody Product product, Errors errors)
