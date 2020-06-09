package de.xinblue.cytoscape.styles;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;




public class GeneralGraphStyles {

	  //Node
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String width;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String height;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String shape;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_opacity;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String border_width;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String border_style;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String border_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String border_opacity;
	  
	  
	  //Text
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String padding;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String label;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_opacity;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String font_family;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String font_size;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String font_style;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String font_weight;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_halign;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_valign;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_margin_x;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_margin_y;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_outline_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_outline_opacity;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_outline_width;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_background_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_background_opacity;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_background_shape;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_background_padding;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_image;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_image_opacity;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_width;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_height;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_fit;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_clip;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_position_x;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_position_y;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_offset_x;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String background_offset_y;
	  
	  //Edge
	  
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String curve_style;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String line_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String line_style;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String line_cap;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String line_fill;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String line_dash_pattern;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String line_dash_offset;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String arrow_scale;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String source_arrow_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String source_arrow_shape;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String source_arrow_fill;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String mid_source_arrow_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String mid_source_arrow_shape;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String mid_source_arrow_fill;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String target_arrow_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String target_arrow_shape;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String target_arrow_fill;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String mid_target_arrow_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String mid_target_arrow_shape;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String mid_target_arrow_fill;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String source_endpoint;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String target_endpoint;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String source_distance_from_node;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String target_distance_from_node;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String source_label;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String target_label;

	  
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String line_gradient_stop_colors;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String line_gradient_stop_positions;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String display;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String visibility;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String opacity;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String z_index;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_wrap;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_max_width;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_overflow_wrap;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_justification;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_rotation;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String source_text_rotation;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String target_text_rotation;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_border_opacity;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_border_width;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_border_style;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_border_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String events;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String text_events;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String overlay_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String overlay_padding;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String overlay_opacity;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String transition_property;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String transition_duration;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String transition_delay;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String transition_timing_function;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String selection_box_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String selection_box_border_color;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String selection_box_border_width;
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String selection_box_opacity;


	  public static class Builder {
	    
	    private String width;
	    private String height;
	    private String shape;
	    private String background_color;
	    private String background_opacity;
	    private String border_width;
	    private String border_style;
	    private String border_color;
	    private String border_opacity;
	    private String padding;
	    private String label;
	    private String color;
	    private String text_opacity;
	    private String font_family;
	    private String font_size;
	    private String font_style;
	    private String font_weight;
	    private String text_halign;
	    private String text_valign;
	    private String text_margin_x;
	    private String text_margin_y;
	    private String text_outline_color;
	    private String text_outline_opacity;
	    private String text_outline_width;
	    private String text_background_color;
	    private String text_background_opacity;
	    private String text_background_shape;
	    private String text_background_padding;
	    private String background_image;
	    private String background_image_opacity;
	    private String background_width;
	    private String background_height;
	    private String background_fit;
	    private String background_clip;
	    private String background_position_x;
	    private String background_position_y;
	    private String background_offset_x;
	    private String background_offset_y;
	    private String curve_style;
		private String line_color;
		private String line_style;
		private String line_cap;
		private String line_fill;
		private String line_dash_pattern;
		private String line_dash_offset;
	    private String arrow_scale;
	    private String source_arrow_color;
	    private String source_arrow_shape;
	    private String source_arrow_fill;
	    private String mid_source_arrow_color;
	    private String mid_source_arrow_shape;
	    private String mid_source_arrow_fill;
	    private String target_arrow_color;
	    private String target_arrow_shape;
	    private String target_arrow_fill;
	    private String mid_target_arrow_color;
	    private String mid_target_arrow_shape;
	    private String mid_target_arrow_fill;
	    private String source_endpoint;
	    private String target_endpoint;
	    private String source_distance_from_node;
	    private String target_distance_from_node;
	    private String source_label;
	    private String target_label;
	    private String line_gradient_stop_colors;
	    private String line_gradient_stop_positions;
	    private String display;
	    private String visibility;
	    private String opacity;
	    private String z_index;
	    private String text_wrap;
	    private String text_max_width;
	    private String text_overflow_wrap;
	    private String text_justification;
	    private String text_rotation;
	    private String source_text_rotation;
	    private String target_text_rotation;
	    private String text_border_opacity;
	    private String text_border_width;
	    private String text_border_style;
	    private String text_border_color;
	    private String events;
	    private String text_events;
	    private String overlay_color;
	    private String overlay_padding;
	    private String overlay_opacity;
	    private String transition_property;
	    private String transition_duration;
	    private String transition_delay;
	    private String transition_timing_function;
	    private String selection_box_color;
	    private String selection_box_border_color;
	    private String selection_box_border_width;
	    private String selection_box_opacity;


	    public Builder() {    
	    }
	      
	    Builder(String width, String height, String shape, String background_color, String background_opacity, String border_width, String border_style, String border_color, String border_opacity, 
	    		String padding, String label, String color, String text_opacity, String font_family, String font_size, String font_style, String font_weight, String text_halign, String text_valign, 
	    		String text_margin_x, String text_margin_y, String text_outline_color, String text_outline_opacity, String text_outline_width, String text_background_color, 
	    		String text_background_opacity, String text_background_shape, String text_background_padding, String background_image, String background_image_opacity, 
	    		String background_width, String background_height, String background_fit, String background_clip, String background_position_x, String background_position_y, String background_offset_x, String background_offset_y,
	    		String curve_style, String line_color, String line_style, String line_cap, String line_fill, String line_dash_pattern, String line_dash_offset,
	    		String arrow_scale, String source_arrow_color, String source_arrow_shape, String source_arrow_fill, String mid_source_arrow_color, String mid_source_arrow_shape, String mid_source_arrow_fill, String target_arrow_color, 
	    		String target_arrow_shape, String target_arrow_fill, String mid_target_arrow_color, String mid_target_arrow_shape, String mid_target_arrow_fill, String source_endpoint, String target_endpoint, String source_distance_from_node, String target_distance_from_node, 
	    		String source_label, String target_label,
	    		String line_gradient_stop_colors, String line_gradient_stop_positions, String display, String visibility, String opacity, String z_index, String text_wrap, 
	    		String text_max_width, String text_overflow_wrap, String text_justification, String text_rotation, String source_text_rotation, String target_text_rotation, 
	    		String text_border_opacity, String text_border_width, String text_border_style, String text_border_color, String events, String text_events, 
	    		String overlay_color, String overlay_padding, String overlay_opacity, String transition_property, String transition_duration, String transition_delay, 
	    		String transition_timing_function, String selection_box_color, String selection_box_border_color, String selection_box_border_width, 
	    		String selection_box_opacit
	    		) {    
	      this.width = width; 
	      this.height = height; 
	      this.shape = shape; 
	      this.background_color = background_color; 
	      this.background_opacity = background_opacity; 
	      this.border_width = border_width; 
	      this.border_style = border_style; 
	      this.border_color = border_color; 
	      this.border_opacity = border_opacity; 
	      this.padding = padding; 
	      this.label = label; 
	      this.color = color; 
	      this.text_opacity = text_opacity; 
	      this.font_family = font_family; 
	      this.font_size = font_size; 
	      this.font_style = font_style; 
	      this.font_weight = font_weight; 
	      this.text_halign = text_halign; 
	      this.text_valign = text_valign; 
	      this.text_margin_x = text_margin_x; 
	      this.text_margin_y = text_margin_y; 
	      this.text_outline_color = text_outline_color; 
	      this.text_outline_opacity = text_outline_opacity; 
	      this.text_outline_width = text_outline_width; 
	      this.text_background_color = text_background_color; 
	      this.text_background_opacity = text_background_opacity; 
	      this.text_background_shape = text_background_shape; 
	      this.text_background_padding = text_background_padding; 
	      this.background_image = background_image; 
	      this.background_image_opacity = background_image_opacity; 
	      this.background_width = background_width; 
	      this.background_height = background_height; 
	      this.background_fit = background_fit; 
	      this.background_clip = background_clip; 
	      this.background_position_x = background_position_x; 
	      this.background_position_y = background_position_y; 
	      this.background_offset_x = background_offset_x; 
	      this.background_offset_y = background_offset_y; 
	      this.curve_style = curve_style; 
		  this.line_color = line_color;
		  this.line_style= line_style;
		  this.line_cap = line_cap;
		  this.line_fill = line_fill;
		  this.line_dash_pattern = line_dash_pattern;
		  this.line_dash_offset = line_dash_offset;
	      this.arrow_scale = arrow_scale; 
	      this.source_arrow_color = source_arrow_color; 
	      this.source_arrow_shape = source_arrow_shape; 
	      this.source_arrow_fill = source_arrow_fill; 
	      this.mid_source_arrow_color = mid_source_arrow_color; 
	      this.mid_source_arrow_shape = mid_source_arrow_shape; 
	      this.mid_source_arrow_fill = mid_source_arrow_fill; 
	      this.target_arrow_color = target_arrow_color; 
	      this.target_arrow_shape = target_arrow_shape; 
	      this.target_arrow_fill = target_arrow_fill; 
	      this.mid_target_arrow_color = mid_target_arrow_color; 
	      this.mid_target_arrow_shape = mid_target_arrow_shape; 
	      this.mid_target_arrow_fill = mid_target_arrow_fill; 
	      this.source_endpoint = source_endpoint; 
	      this.target_endpoint = target_endpoint; 
	      this.source_distance_from_node = source_distance_from_node; 
	      this.target_distance_from_node = target_distance_from_node; 
	      this.source_label = source_label; 
	      this.target_label = target_label; 
	      this.line_gradient_stop_colors = line_gradient_stop_colors; 
	      this.line_gradient_stop_positions = line_gradient_stop_positions; 
	      this.display = display; 
	      this.visibility = visibility; 
	      this.opacity = opacity; 
	      this.z_index = z_index; 
	      this.text_wrap = text_wrap; 
	      this.text_max_width = text_max_width; 
	      this.text_overflow_wrap = text_overflow_wrap; 
	      this.text_justification = text_justification; 
	      this.text_rotation = text_rotation; 
	      this.source_text_rotation = source_text_rotation; 
	      this.target_text_rotation = target_text_rotation; 
	      this.text_border_opacity = text_border_opacity; 
	      this.text_border_width = text_border_width; 
	      this.text_border_style = text_border_style; 
	      this.text_border_color = text_border_color; 
	      this.events = events; 
	      this.text_events = text_events; 
	      this.overlay_color = overlay_color; 
	      this.overlay_padding = overlay_padding; 
	      this.overlay_opacity = overlay_opacity; 
	      this.transition_property = transition_property; 
	      this.transition_duration = transition_duration; 
	      this.transition_delay = transition_delay; 
	      this.transition_timing_function = transition_timing_function; 
	      this.selection_box_color = selection_box_color; 
	      this.selection_box_border_color = selection_box_border_color; 
	      this.selection_box_border_width = selection_box_border_width; 
	      this.selection_box_opacity = selection_box_opacity; 

	    }
	        
	    public Builder width(String width){
	      this.width = width;
	      return Builder.this;
	    }

	    public Builder height(String height){
	      this.height = height;
	      return Builder.this;
	    }

	    public Builder shape(String shape){
	      this.shape = shape;
	      return Builder.this;
	    }

	    public Builder background_color(String background_color){
	      this.background_color = background_color;
	      return Builder.this;
	    }

	    public Builder background_opacity(String background_opacity){
	      this.background_opacity = background_opacity;
	      return Builder.this;
	    }

	    public Builder border_width(String border_width){
	      this.border_width = border_width;
	      return Builder.this;
	    }

	    public Builder border_style(String border_style){
	      this.border_style = border_style;
	      return Builder.this;
	    }

	    public Builder border_color(String border_color){
	      this.border_color = border_color;
	      return Builder.this;
	    }

	    public Builder border_opacity(String border_opacity){
	      this.border_opacity = border_opacity;
	      return Builder.this;
	    }

	    public Builder padding(String padding){
	      this.padding = padding;
	      return Builder.this;
	    }

	    public Builder label(String label){
	      this.label = label;
	      return Builder.this;
	    }

	    public Builder color(String color){
	      this.color = color;
	      return Builder.this;
	    }

	    public Builder text_opacity(String text_opacity){
	      this.text_opacity = text_opacity;
	      return Builder.this;
	    }

	    public Builder font_family(String font_family){
	      this.font_family = font_family;
	      return Builder.this;
	    }

	    public Builder font_size(String font_size){
	      this.font_size = font_size;
	      return Builder.this;
	    }

	    public Builder font_style(String font_style){
	      this.font_style = font_style;
	      return Builder.this;
	    }

	    public Builder font_weight(String font_weight){
	      this.font_weight = font_weight;
	      return Builder.this;
	    }

	    public Builder text_halign(String text_halign){
	      this.text_halign = text_halign;
	      return Builder.this;
	    }

	    public Builder text_valign(String text_valign){
	      this.text_valign = text_valign;
	      return Builder.this;
	    }

	    public Builder text_margin_x(String text_margin_x){
	      this.text_margin_x = text_margin_x;
	      return Builder.this;
	    }

	    public Builder text_margin_y(String text_margin_y){
	      this.text_margin_y = text_margin_y;
	      return Builder.this;
	    }

	    public Builder text_outline_color(String text_outline_color){
	      this.text_outline_color = text_outline_color;
	      return Builder.this;
	    }

	    public Builder text_outline_opacity(String text_outline_opacity){
	      this.text_outline_opacity = text_outline_opacity;
	      return Builder.this;
	    }

	    public Builder text_outline_width(String text_outline_width){
	      this.text_outline_width = text_outline_width;
	      return Builder.this;
	    }

	    public Builder text_background_color(String text_background_color){
	      this.text_background_color = text_background_color;
	      return Builder.this;
	    }

	    public Builder text_background_opacity(String text_background_opacity){
	      this.text_background_opacity = text_background_opacity;
	      return Builder.this;
	    }

	    public Builder text_background_shape(String text_background_shape){
	      this.text_background_shape = text_background_shape;
	      return Builder.this;
	    }

	    public Builder text_background_padding(String text_background_padding){
	      this.text_background_padding = text_background_padding;
	      return Builder.this;
	    }

	    public Builder background_image(String background_image){
	      this.background_image = background_image;
	      return Builder.this;
	    }

	    public Builder background_image_opacity(String background_image_opacity){
	      this.background_image_opacity = background_image_opacity;
	      return Builder.this;
	    }

	    public Builder background_width(String background_width){
	      this.background_width = background_width;
	      return Builder.this;
	    }

	    public Builder background_height(String background_height){
	      this.background_height = background_height;
	      return Builder.this;
	    }

	    public Builder background_fit(String background_fit){
	      this.background_fit = background_fit;
	      return Builder.this;
	    }

	    public Builder background_clip(String background_clip){
	      this.background_clip = background_clip;
	      return Builder.this;
	    }

	    public Builder background_position_x(String background_position_x){
	      this.background_position_x = background_position_x;
	      return Builder.this;
	    }

	    public Builder background_position_y(String background_position_y){
	      this.background_position_y = background_position_y;
	      return Builder.this;
	    }

	    public Builder background_offset_x(String background_offset_x){
	      this.background_offset_x = background_offset_x;
	      return Builder.this;
	    }

	    public Builder background_offset_y(String background_offset_y){
	      this.background_offset_y = background_offset_y;
	      return Builder.this;
	    }
	    
	    public Builder curve_style(String curve_style){
		      this.curve_style = curve_style;
		      return Builder.this;
		    }
		    
	    public Builder line_color(String line_color){
		      this.line_color = line_color;
		      return Builder.this;
		    }
	    
	    public Builder line_style(String line_style){
		      this.line_style = line_style;
		      return Builder.this;
		    }
	    
	    public Builder line_cap(String line_cap){
		      this.line_cap = line_cap;
		      return Builder.this;
		    }
	    
	    public Builder line_fill(String line_fill){
		      this.line_fill = line_fill;
		      return Builder.this;
		    }
	    
	    public Builder line_dash_pattern(String line_dash_pattern){
		      this.line_dash_pattern = line_dash_pattern;
		      return Builder.this;
		    }
	    
	    public Builder line_dash_offset(String line_dash_offset){
		      this.line_dash_offset = line_dash_offset;
		      return Builder.this;
		    }

	    public Builder arrow_scale(String arrow_scale){
	      this.arrow_scale = arrow_scale;
	      return Builder.this;
	    }

	    public Builder source_arrow_color(String source_arrow_color){
	      this.source_arrow_color = source_arrow_color;
	      return Builder.this;
	    }

	    public Builder source_arrow_shape(String source_arrow_shape){
	      this.source_arrow_shape = source_arrow_shape;
	      return Builder.this;
	    }

	    public Builder source_arrow_fill(String source_arrow_fill){
	      this.source_arrow_fill = source_arrow_fill;
	      return Builder.this;
	    }

	    public Builder mid_source_arrow_color(String mid_source_arrow_color){
	      this.mid_source_arrow_color = mid_source_arrow_color;
	      return Builder.this;
	    }

	    public Builder mid_source_arrow_shape(String mid_source_arrow_shape){
	      this.mid_source_arrow_shape = mid_source_arrow_shape;
	      return Builder.this;
	    }

	    public Builder mid_source_arrow_fill(String mid_source_arrow_fill){
	      this.mid_source_arrow_fill = mid_source_arrow_fill;
	      return Builder.this;
	    }

	    public Builder target_arrow_color(String target_arrow_color){
	      this.target_arrow_color = target_arrow_color;
	      return Builder.this;
	    }

	    public Builder target_arrow_shape(String target_arrow_shape){
	      this.target_arrow_shape = target_arrow_shape;
	      return Builder.this;
	    }

	    public Builder target_arrow_fill(String target_arrow_fill){
	      this.target_arrow_fill = target_arrow_fill;
	      return Builder.this;
	    }

	    public Builder mid_target_arrow_color(String mid_target_arrow_color){
	      this.mid_target_arrow_color = mid_target_arrow_color;
	      return Builder.this;
	    }

	    public Builder mid_target_arrow_shape(String mid_target_arrow_shape){
	      this.mid_target_arrow_shape = mid_target_arrow_shape;
	      return Builder.this;
	    }

	    public Builder mid_target_arrow_fill(String mid_target_arrow_fill){
	      this.mid_target_arrow_fill = mid_target_arrow_fill;
	      return Builder.this;
	    }

	    public Builder source_endpoint(String source_endpoint){
	      this.source_endpoint = source_endpoint;
	      return Builder.this;
	    }

	    public Builder target_endpoint(String target_endpoint){
	      this.target_endpoint = target_endpoint;
	      return Builder.this;
	    }

	    public Builder source_distance_from_node(String source_distance_from_node){
	      this.source_distance_from_node = source_distance_from_node;
	      return Builder.this;
	    }

	    public Builder target_distance_from_node(String target_distance_from_node){
	      this.target_distance_from_node = target_distance_from_node;
	      return Builder.this;
	    }

	    public Builder source_label(String source_label){
	      this.source_label = source_label;
	      return Builder.this;
	    }

	    public Builder target_label(String target_label){
	      this.target_label = target_label;
	      return Builder.this;
	    }
	    
	    public Builder line_gradient_stop_colors(String line_gradient_stop_colors){
	        this.line_gradient_stop_colors = line_gradient_stop_colors;
	        return Builder.this;
	      }

	      public Builder line_gradient_stop_positions(String line_gradient_stop_positions){
	        this.line_gradient_stop_positions = line_gradient_stop_positions;
	        return Builder.this;
	      }

	      public Builder display(String display){
	        this.display = display;
	        return Builder.this;
	      }

	      public Builder visibility(String visibility){
	        this.visibility = visibility;
	        return Builder.this;
	      }

	      public Builder opacity(String opacity){
	        this.opacity = opacity;
	        return Builder.this;
	      }

	      public Builder z_index(String z_index){
	        this.z_index = z_index;
	        return Builder.this;
	      }

	      public Builder text_wrap(String text_wrap){
	        this.text_wrap = text_wrap;
	        return Builder.this;
	      }

	      public Builder text_max_width(String text_max_width){
	        this.text_max_width = text_max_width;
	        return Builder.this;
	      }

	      public Builder text_overflow_wrap(String text_overflow_wrap){
	        this.text_overflow_wrap = text_overflow_wrap;
	        return Builder.this;
	      }

	      public Builder text_justification(String text_justification){
	        this.text_justification = text_justification;
	        return Builder.this;
	      }

	      public Builder text_rotation(String text_rotation){
	        this.text_rotation = text_rotation;
	        return Builder.this;
	      }

	      public Builder source_text_rotation(String source_text_rotation){
	        this.source_text_rotation = source_text_rotation;
	        return Builder.this;
	      }

	      public Builder target_text_rotation(String target_text_rotation){
	        this.target_text_rotation = target_text_rotation;
	        return Builder.this;
	      }

	      public Builder text_border_opacity(String text_border_opacity){
	        this.text_border_opacity = text_border_opacity;
	        return Builder.this;
	      }

	      public Builder text_border_width(String text_border_width){
	        this.text_border_width = text_border_width;
	        return Builder.this;
	      }

	      public Builder text_border_style(String text_border_style){
	        this.text_border_style = text_border_style;
	        return Builder.this;
	      }

	      public Builder text_border_color(String text_border_color){
	        this.text_border_color = text_border_color;
	        return Builder.this;
	      }

	      public Builder events(String events){
	        this.events = events;
	        return Builder.this;
	      }

	      public Builder text_events(String text_events){
	        this.text_events = text_events;
	        return Builder.this;
	      }

	      public Builder overlay_color(String overlay_color){
	        this.overlay_color = overlay_color;
	        return Builder.this;
	      }

	      public Builder overlay_padding(String overlay_padding){
	        this.overlay_padding = overlay_padding;
	        return Builder.this;
	      }

	      public Builder overlay_opacity(String overlay_opacity){
	        this.overlay_opacity = overlay_opacity;
	        return Builder.this;
	      }

	      public Builder transition_property(String transition_property){
	        this.transition_property = transition_property;
	        return Builder.this;
	      }

	      public Builder transition_duration(String transition_duration){
	        this.transition_duration = transition_duration;
	        return Builder.this;
	      }

	      public Builder transition_delay(String transition_delay){
	        this.transition_delay = transition_delay;
	        return Builder.this;
	      }

	      public Builder transition_timing_function(String transition_timing_function){
	        this.transition_timing_function = transition_timing_function;
	        return Builder.this;
	      }

	      public Builder selection_box_color(String selection_box_color){
	        this.selection_box_color = selection_box_color;
	        return Builder.this;
	      }

	      public Builder selection_box_border_color(String selection_box_border_color){
	        this.selection_box_border_color = selection_box_border_color;
	        return Builder.this;
	      }

	      public Builder selection_box_border_width(String selection_box_border_width){
	        this.selection_box_border_width = selection_box_border_width;
	        return Builder.this;
	      }

	      public Builder selection_box_opacity(String selection_box_opacity){
	        this.selection_box_opacity = selection_box_opacity;
	        return Builder.this;
	      }	    

	    public GeneralGraphStyles build() {

	        return new GeneralGraphStyles(this);
	    }
	  }

	  private GeneralGraphStyles(Builder builder) {
	    this.width = builder.width; 
	    this.height = builder.height; 
	    this.shape = builder.shape; 
	    this.background_color = builder.background_color; 
	    this.background_opacity = builder.background_opacity; 
	    this.border_width = builder.border_width; 
	    this.border_style = builder.border_style; 
	    this.border_color = builder.border_color; 
	    this.border_opacity = builder.border_opacity; 
	    this.padding = builder.padding; 
	    this.label = builder.label; 
	    this.color = builder.color; 
	    this.text_opacity = builder.text_opacity; 
	    this.font_family = builder.font_family; 
	    this.font_size = builder.font_size; 
	    this.font_style = builder.font_style; 
	    this.font_weight = builder.font_weight; 
	    this.text_halign = builder.text_halign; 
	    this.text_valign = builder.text_valign; 
	    this.text_margin_x = builder.text_margin_x; 
	    this.text_margin_y = builder.text_margin_y; 
	    this.text_outline_color = builder.text_outline_color; 
	    this.text_outline_opacity = builder.text_outline_opacity; 
	    this.text_outline_width = builder.text_outline_width; 
	    this.text_background_color = builder.text_background_color; 
	    this.text_background_opacity = builder.text_background_opacity; 
	    this.text_background_shape = builder.text_background_shape; 
	    this.text_background_padding = builder.text_background_padding; 
	    this.background_image = builder.background_image; 
	    this.background_image_opacity = builder.background_image_opacity; 
	    this.background_width = builder.background_width; 
	    this.background_height = builder.background_height; 
	    this.background_fit = builder.background_fit; 
	    this.background_clip = builder.background_clip; 
	    this.background_position_x = builder.background_position_x; 
	    this.background_position_y = builder.background_position_y; 
	    this.background_offset_x = builder.background_offset_x; 
	    this.background_offset_y = builder.background_offset_y;
	    this.curve_style = builder.curve_style; 
		this.line_color = builder.line_color;
		this.line_style= builder.line_style;
		this.line_cap = builder.line_cap;
		this.line_fill = builder.line_fill;
		this.line_dash_pattern = builder.line_dash_pattern;
		this.line_dash_offset = builder.line_dash_offset;
	    this.arrow_scale = builder.arrow_scale; 
	    this.source_arrow_color = builder.source_arrow_color; 
	    this.source_arrow_shape = builder.source_arrow_shape; 
	    this.source_arrow_fill = builder.source_arrow_fill; 
	    this.mid_source_arrow_color = builder.mid_source_arrow_color; 
	    this.mid_source_arrow_shape = builder.mid_source_arrow_shape; 
	    this.mid_source_arrow_fill = builder.mid_source_arrow_fill; 
	    this.target_arrow_color = builder.target_arrow_color; 
	    this.target_arrow_shape = builder.target_arrow_shape; 
	    this.target_arrow_fill = builder.target_arrow_fill; 
	    this.mid_target_arrow_color = builder.mid_target_arrow_color; 
	    this.mid_target_arrow_shape = builder.mid_target_arrow_shape; 
	    this.mid_target_arrow_fill = builder.mid_target_arrow_fill; 
	    this.source_endpoint = builder.source_endpoint; 
	    this.target_endpoint = builder.target_endpoint; 
	    this.source_distance_from_node = builder.source_distance_from_node; 
	    this.target_distance_from_node = builder.target_distance_from_node; 
	    this.source_label = builder.source_label; 
	    this.target_label = builder.target_label; 
	    this.line_gradient_stop_colors = builder.line_gradient_stop_colors; 
	    this.line_gradient_stop_positions = builder.line_gradient_stop_positions; 
	    this.display = builder.display; 
	    this.visibility = builder.visibility; 
	    this.opacity = builder.opacity; 
	    this.z_index = builder.z_index; 
	    this.text_wrap = builder.text_wrap; 
	    this.text_max_width = builder.text_max_width; 
	    this.text_overflow_wrap = builder.text_overflow_wrap; 
	    this.text_justification = builder.text_justification; 
	    this.text_rotation = builder.text_rotation; 
	    this.source_text_rotation = builder.source_text_rotation; 
	    this.target_text_rotation = builder.target_text_rotation; 
	    this.text_border_opacity = builder.text_border_opacity; 
	    this.text_border_width = builder.text_border_width; 
	    this.text_border_style = builder.text_border_style; 
	    this.text_border_color = builder.text_border_color; 
	    this.events = builder.events; 
	    this.text_events = builder.text_events; 
	    this.overlay_color = builder.overlay_color; 
	    this.overlay_padding = builder.overlay_padding; 
	    this.overlay_opacity = builder.overlay_opacity; 
	    this.transition_property = builder.transition_property; 
	    this.transition_duration = builder.transition_duration; 
	    this.transition_delay = builder.transition_delay; 
	    this.transition_timing_function = builder.transition_timing_function; 
	    this.selection_box_color = builder.selection_box_color; 
	    this.selection_box_border_color = builder.selection_box_border_color; 
	    this.selection_box_border_width = builder.selection_box_border_width; 
	    this.selection_box_opacity = builder.selection_box_opacity;     
	  }
	
	
	@JsonProperty("width")
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	@JsonProperty("height")
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	@JsonProperty("shape")
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	@JsonProperty("background-color")
	public String getBackground_color() {
		return background_color;
	}
	public void setBackground_color(String background_color) {
		this.background_color = background_color;
	}
	@JsonProperty("background-opacity")
	public String getBackground_opacity() {
		return background_opacity;
	}
	public void setBackground_opacity(String background_opacity) {
		this.background_opacity = background_opacity;
	}
	@JsonProperty("border-width")
	public String getBorder_width() {
		return border_width;
	}
	public void setBorder_width(String border_width) {
		this.border_width = border_width;
	}
	@JsonProperty("border-style")
	public String getBorder_style() {
		return border_style;
	}
	public void setBorder_style(String border_style) {
		this.border_style = border_style;
	}
	@JsonProperty("border-color")
	public String getBorder_color() {
		return border_color;
	}
	public void setBorder_color(String border_color) {
		this.border_color = border_color;
	}
	@JsonProperty("border-opacity")
	public String getBorder_opacity() {
		return border_opacity;
	}
	public void setBorder_opacity(String border_opacity) {
		this.border_opacity = border_opacity;
	}
	@JsonProperty("padding")
	public String getPadding() {
		return padding;
	}
	public void setPadding(String padding) {
		this.padding = padding;
	}
	@JsonProperty("label")
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@JsonProperty("color")
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@JsonProperty("text-opacity")
	public String getText_opacity() {
		return text_opacity;
	}
	public void setText_opacity(String text_opacity) {
		this.text_opacity = text_opacity;
	}
	@JsonProperty("font-family")
	public String getFont_family() {
		return font_family;
	}
	public void setFont_family(String font_family) {
		this.font_family = font_family;
	}
	@JsonProperty("font-size")
	public String getFont_size() {
		return font_size;
	}
	public void setFont_size(String font_size) {
		this.font_size = font_size;
	}
	@JsonProperty("font-style")
	public String getFont_style() {
		return font_style;
	}
	public void setFont_style(String font_style) {
		this.font_style = font_style;
	}
	@JsonProperty("font-weight")
	public String getFont_weight() {
		return font_weight;
	}
	public void setFont_weight(String font_weight) {
		this.font_weight = font_weight;
	}
	@JsonProperty("text-halign")
	public String getText_halign() {
		return text_halign;
	}
	public void setText_halign(String text_halign) {
		this.text_halign = text_halign;
	}
	@JsonProperty("text-valign")
	public String getText_valign() {
		return text_valign;
	}
	public void setText_valign(String text_valign) {
		this.text_valign = text_valign;
	}
	@JsonProperty("text-margin-x")
	public String getText_margin_x() {
		return text_margin_x;
	}
	public void setText_margin_x(String text_margin_x) {
		this.text_margin_x = text_margin_x;
	}
	@JsonProperty("text-margin-y")
	public String getText_margin_y() {
		return text_margin_y;
	}
	public void setText_margin_y(String text_margin_y) {
		this.text_margin_y = text_margin_y;
	}
	@JsonProperty("text-outline-color")
	public String getText_outline_color() {
		return text_outline_color;
	}
	public void setText_outline_color(String text_outline_color) {
		this.text_outline_color = text_outline_color;
	}
	@JsonProperty("text-outline-opacity")
	public String getText_outline_opacity() {
		return text_outline_opacity;
	}
	public void setText_outline_opacity(String text_outline_opacity) {
		this.text_outline_opacity = text_outline_opacity;
	}
	@JsonProperty("text-outline-width")
	public String getText_outline_width() {
		return text_outline_width;
	}
	public void setText_outline_width(String text_outline_width) {
		this.text_outline_width = text_outline_width;
	}
	@JsonProperty("text-background-color")
	public String getText_background_color() {
		return text_background_color;
	}
	public void setText_background_color(String text_background_color) {
		this.text_background_color = text_background_color;
	}
	@JsonProperty("text-background-opacity")
	public String getText_background_opacity() {
		return text_background_opacity;
	}
	public void setText_background_opacity(String text_background_opacity) {
		this.text_background_opacity = text_background_opacity;
	}
	@JsonProperty("text-background-shape")
	public String getText_background_shape() {
		return text_background_shape;
	}
	public void setText_background_shape(String text_background_shape) {
		this.text_background_shape = text_background_shape;
	}
	@JsonProperty("text-background-padding")
	public String getText_background_padding() {
		return text_background_padding;
	}
	public void setText_background_padding(String text_background_padding) {
		this.text_background_padding = text_background_padding;
	}
	@JsonProperty("background-image")
	public String getBackground_image() {
		return background_image;
	}
	public void setBackground_image(String background_image) {
		this.background_image = background_image;
	}
	@JsonProperty("background-image-opacity")
	public String getBackground_image_opacity() {
		return background_image_opacity;
	}
	public void setBackground_image_opacity(String background_image_opacity) {
		this.background_image_opacity = background_image_opacity;
	}
	@JsonProperty("background-width")
	public String getBackground_width() {
		return background_width;
	}
	public void setBackground_width(String background_width) {
		this.background_width = background_width;
	}
	@JsonProperty("background-height")
	public String getBackground_height() {
		return background_height;
	}
	public void setBackground_height(String background_height) {
		this.background_height = background_height;
	}
	@JsonProperty("background-fit")
	public String getBackground_fit() {
		return background_fit;
	}
	public void setBackground_fit(String background_fit) {
		this.background_fit = background_fit;
	}
	@JsonProperty("background-clip")
	public String getBackground_clip() {
		return background_clip;
	}
	public void setBackground_clip(String background_clip) {
		this.background_clip = background_clip;
	}
	@JsonProperty("background-position-x")
	public String getBackground_position_x() {
		return background_position_x;
	}
	public void setBackground_position_x(String background_position_x) {
		this.background_position_x = background_position_x;
	}
	@JsonProperty("background-position-y")
	public String getBackground_position_y() {
		return background_position_y;
	}
	public void setBackground_position_y(String background_position_y) {
		this.background_position_y = background_position_y;
	}
	@JsonProperty("background-offset-x")
	public String getBackground_offset_x() {
		return background_offset_x;
	}
	public void setBackground_offset_x(String background_offset_x) {
		this.background_offset_x = background_offset_x;
	}
	@JsonProperty("background-offset-y")
	public String getBackground_offset_y() {
		return background_offset_y;
	}
	public void setBackground_offset_y(String background_offset_y) {
		this.background_offset_y = background_offset_y;
	}
	@JsonProperty("line-color")
	public String getLine_color() {
		return line_color;
	}

	public void setLine_color(String line_color) {
		this.line_color = line_color;
	}
	@JsonProperty("line-style")
	public String getLine_style() {
		return line_style;
	}

	public void setLine_style(String line_style) {
		this.line_style = line_style;
	}
	@JsonProperty("line-cap")
	public String getLine_cap() {
		return line_cap;
	}

	public void setLine_cap(String line_cap) {
		this.line_cap = line_cap;
	}
	@JsonProperty("line-fill")
	public String getLine_fill() {
		return line_fill;
	}

	public void setLine_fill(String line_fill) {
		this.line_fill = line_fill;
	}
	@JsonProperty("line-dash-pattern")
	public String getLine_dash_pattern() {
		return line_dash_pattern;
	}

	public void setLine_dash_pattern(String line_dash_pattern) {
		this.line_dash_pattern = line_dash_pattern;
	}
	@JsonProperty("line-dash-offset")
	public String getLine_dash_offset() {
		return line_dash_offset;
	}

	public void setLine_dash_offset(String line_dash_offset) {
		this.line_dash_offset = line_dash_offset;
	}
	@JsonProperty("curve-style")
	public String getCurve_style() {
		return curve_style;
	}

	public void setCurve_style(String curve_style) {
		this.curve_style = curve_style;
	}
	@JsonProperty("arrow-scale")
	public String getArrow_scale() {
		return arrow_scale;
	}

	public void setArrow_scale(String arrow_scale) {
		this.arrow_scale = arrow_scale;
	}
	@JsonProperty("source-arrow-color")
	public String getSource_arrow_color() {
		return source_arrow_color;
	}

	public void setSource_arrow_color(String source_arrow_color) {
		this.source_arrow_color = source_arrow_color;
	}
	@JsonProperty("source-arrow-shape")
	public String getSource_arrow_shape() {
		return source_arrow_shape;
	}

	public void setSource_arrow_shape(String source_arrow_shape) {
		this.source_arrow_shape = source_arrow_shape;
	}
	@JsonProperty("source-arrow-fill")
	public String getSource_arrow_fill() {
		return source_arrow_fill;
	}

	public void setSource_arrow_fill(String source_arrow_fill) {
		this.source_arrow_fill = source_arrow_fill;
	}
	@JsonProperty("mid-source-arrow-color")
	public String getMid_source_arrow_color() {
		return mid_source_arrow_color;
	}

	public void setMid_source_arrow_color(String mid_source_arrow_color) {
		this.mid_source_arrow_color = mid_source_arrow_color;
	}
	@JsonProperty("mid-source-arrow-shape")
	public String getMid_source_arrow_shape() {
		return mid_source_arrow_shape;
	}

	public void setMid_source_arrow_shape(String mid_source_arrow_shape) {
		this.mid_source_arrow_shape = mid_source_arrow_shape;
	}
	@JsonProperty("mid-source-arrow-fill")
	public String getMid_source_arrow_fill() {
		return mid_source_arrow_fill;
	}

	public void setMid_source_arrow_fill(String mid_source_arrow_fill) {
		this.mid_source_arrow_fill = mid_source_arrow_fill;
	}
	@JsonProperty("target-arrow-color")
	public String getTarget_arrow_color() {
		return target_arrow_color;
	}

	public void setTarget_arrow_color(String target_arrow_color) {
		this.target_arrow_color = target_arrow_color;
	}
	@JsonProperty("target-arrow-shape")
	public String getTarget_arrow_shape() {
		return target_arrow_shape;
	}

	public void setTarget_arrow_shape(String target_arrow_shape) {
		this.target_arrow_shape = target_arrow_shape;
	}
	@JsonProperty("target-arrow-fill")
	public String getTarget_arrow_fill() {
		return target_arrow_fill;
	}

	public void setTarget_arrow_fill(String target_arrow_fill) {
		this.target_arrow_fill = target_arrow_fill;
	}
	@JsonProperty("mid-target-arrow-color")
	public String getMid_target_arrow_color() {
		return mid_target_arrow_color;
	}

	public void setMid_target_arrow_color(String mid_target_arrow_color) {
		this.mid_target_arrow_color = mid_target_arrow_color;
	}
	@JsonProperty("mid-target-arrow-shape")
	public String getMid_target_arrow_shape() {
		return mid_target_arrow_shape;
	}

	public void setMid_target_arrow_shape(String mid_target_arrow_shape) {
		this.mid_target_arrow_shape = mid_target_arrow_shape;
	}
	@JsonProperty("mid-target-arrow-fill")
	public String getMid_target_arrow_fill() {
		return mid_target_arrow_fill;
	}

	public void setMid_target_arrow_fill(String mid_target_arrow_fill) {
		this.mid_target_arrow_fill = mid_target_arrow_fill;
	}
	@JsonProperty("source-endpoint")
	public String getSource_endpoint() {
		return source_endpoint;
	}

	public void setSource_endpoint(String source_endpoint) {
		this.source_endpoint = source_endpoint;
	}
	@JsonProperty("target-endpoint")
	public String getTarget_endpoint() {
		return target_endpoint;
	}

	public void setTarget_endpoint(String target_endpoint) {
		this.target_endpoint = target_endpoint;
	}
	@JsonProperty("source-distance-from-node")
	public String getSource_distance_from_node() {
		return source_distance_from_node;
	}

	public void setSource_distance_from_node(String source_distance_from_node) {
		this.source_distance_from_node = source_distance_from_node;
	}
	@JsonProperty("target-distance-from-node")
	public String getTarget_distance_from_node() {
		return target_distance_from_node;
	}

	public void setTarget_distance_from_node(String target_distance_from_node) {
		this.target_distance_from_node = target_distance_from_node;
	}


	@JsonProperty("source-label")
	public String getSource_label() {
		return source_label;
	}


	public void setSource_label(String source_label) {
		this.source_label = source_label;
	}

	@JsonProperty("target-label")
	public String getTarget_label() {
		return target_label;
	}


	public void setTarget_label(String target_label) {
		this.target_label = target_label;
	}

	@JsonProperty("line-gradient-stop-colors")
	public String getLine_gradient_stop_colors() {
		return line_gradient_stop_colors;
	}


	public void setLine_gradient_stop_colors(String line_gradient_stop_colors) {
		this.line_gradient_stop_colors = line_gradient_stop_colors;
	}

	@JsonProperty("line-gradient-stop-positions")
	public String getLine_gradient_stop_positions() {
		return line_gradient_stop_positions;
	}


	public void setLine_gradient_stop_positions(String line_gradient_stop_positions) {
		this.line_gradient_stop_positions = line_gradient_stop_positions;
	}

	@JsonProperty("display")
	public String getDisplay() {
		return display;
	}


	public void setDisplay(String display) {
		this.display = display;
	}

	@JsonProperty("visibility")
	public String getVisibility() {
		return visibility;
	}


	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	@JsonProperty("opacity")
	public String getOpacity() {
		return opacity;
	}


	public void setOpacity(String opacity) {
		this.opacity = opacity;
	}

	@JsonProperty("z-index")
	public String getZ_index() {
		return z_index;
	}


	public void setZ_index(String z_index) {
		this.z_index = z_index;
	}

	@JsonProperty("text-wrap")
	public String getText_wrap() {
		return text_wrap;
	}


	public void setText_wrap(String text_wrap) {
		this.text_wrap = text_wrap;
	}

	@JsonProperty("text-max-width")
	public String getText_max_width() {
		return text_max_width;
	}


	public void setText_max_width(String text_max_width) {
		this.text_max_width = text_max_width;
	}

	@JsonProperty("text-overflow-wrap")
	public String getText_overflow_wrap() {
		return text_overflow_wrap;
	}


	public void setText_overflow_wrap(String text_overflow_wrap) {
		this.text_overflow_wrap = text_overflow_wrap;
	}

	@JsonProperty("text-justification")
	public String getText_justification() {
		return text_justification;
	}


	public void setText_justification(String text_justification) {
		this.text_justification = text_justification;
	}

	@JsonProperty("text-rotation")
	public String getText_rotation() {
		return text_rotation;
	}


	public void setText_rotation(String text_rotation) {
		this.text_rotation = text_rotation;
	}

	@JsonProperty("source-text-rotation")
	public String getSource_text_rotation() {
		return source_text_rotation;
	}


	public void setSource_text_rotation(String source_text_rotation) {
		this.source_text_rotation = source_text_rotation;
	}

	@JsonProperty("target-text-rotation")
	public String getTarget_text_rotation() {
		return target_text_rotation;
	}


	public void setTarget_text_rotation(String target_text_rotation) {
		this.target_text_rotation = target_text_rotation;
	}

	@JsonProperty("text-border-opacity")
	public String getText_border_opacity() {
		return text_border_opacity;
	}


	public void setText_border_opacity(String text_border_opacity) {
		this.text_border_opacity = text_border_opacity;
	}

	@JsonProperty("text-border-width")
	public String getText_border_width() {
		return text_border_width;
	}


	public void setText_border_width(String text_border_width) {
		this.text_border_width = text_border_width;
	}

	@JsonProperty("text-border-style")
	public String getText_border_style() {
		return text_border_style;
	}


	public void setText_border_style(String text_border_style) {
		this.text_border_style = text_border_style;
	}

	@JsonProperty("text-border-color")
	public String getText_border_color() {
		return text_border_color;
	}


	public void setText_border_color(String text_border_color) {
		this.text_border_color = text_border_color;
	}

	@JsonProperty("events")
	public String getEvents() {
		return events;
	}


	public void setEvents(String events) {
		this.events = events;
	}

	@JsonProperty("text-events")
	public String getText_events() {
		return text_events;
	}


	public void setText_events(String text_events) {
		this.text_events = text_events;
	}

	@JsonProperty("overlay-color")
	public String getOverlay_color() {
		return overlay_color;
	}


	public void setOverlay_color(String overlay_color) {
		this.overlay_color = overlay_color;
	}

	@JsonProperty("overlay-padding")
	public String getOverlay_padding() {
		return overlay_padding;
	}


	public void setOverlay_padding(String overlay_padding) {
		this.overlay_padding = overlay_padding;
	}

	@JsonProperty("overlay-opacity")
	public String getOverlay_opacity() {
		return overlay_opacity;
	}


	public void setOverlay_opacity(String overlay_opacity) {
		this.overlay_opacity = overlay_opacity;
	}

	@JsonProperty("transition-property")
	public String getTransition_property() {
		return transition_property;
	}


	public void setTransition_property(String transition_property) {
		this.transition_property = transition_property;
	}

	@JsonProperty("transition-duration")
	public String getTransition_duration() {
		return transition_duration;
	}


	public void setTransition_duration(String transition_duration) {
		this.transition_duration = transition_duration;
	}

	@JsonProperty("transition-delay")
	public String getTransition_delay() {
		return transition_delay;
	}


	public void setTransition_delay(String transition_delay) {
		this.transition_delay = transition_delay;
	}

	@JsonProperty("transition-timing-function")
	public String getTransition_timing_function() {
		return transition_timing_function;
	}


	public void setTransition_timing_function(String transition_timing_function) {
		this.transition_timing_function = transition_timing_function;
	}

	@JsonProperty("selection-box-color")
	public String getSelection_box_color() {
		return selection_box_color;
	}


	public void setSelection_box_color(String selection_box_color) {
		this.selection_box_color = selection_box_color;
	}

	@JsonProperty("selection-box-border-color")
	public String getSelection_box_border_color() {
		return selection_box_border_color;
	}


	public void setSelection_box_border_color(String selection_box_border_color) {
		this.selection_box_border_color = selection_box_border_color;
	}

	@JsonProperty("selection-box-border-width")
	public String getSelection_box_border_width() {
		return selection_box_border_width;
	}


	public void setSelection_box_border_width(String selection_box_border_width) {
		this.selection_box_border_width = selection_box_border_width;
	}

	@JsonProperty("selection-box-opacit")
	public String getSelection_box_opacity() {
		return selection_box_opacity;
	}


	public void setSelection_box_opacity(String selection_box_opacity) {
		this.selection_box_opacity = selection_box_opacity;
	}

 
}
