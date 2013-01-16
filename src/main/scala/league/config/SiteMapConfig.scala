package league.config
import net.liftweb.sitemap.SiteMap
import net.liftweb.sitemap.Menu
import net.liftweb.http._
import net.liftweb.sitemap.Loc._

object SiteMapConfig {
  def siteMap() = SiteMap(
  Menu(S ? "Home") / "index",
  Menu(S ? "About US") / "about",
  Menu(S ? "Contact US") / "contact",
  Menu(S ? "Hidden Menu") / "hidden" >> Hidden,
  Menu(S ? "Admin") / "admin" / "index" >> If(() => 1>2, "You must be logged in")
 )
}